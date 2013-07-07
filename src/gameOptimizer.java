/**
 * A mock up for a program that allows you to save screenshots
 * and kill processes prior to playing a video game. It also allows 
 * the timing the amount played for each game profile.
 * 
 * @author Mark Holland, Álvaro Ponce Arévalo
 */

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import com.trolltech.qt.core.QTime;
import com.trolltech.qt.core.Qt;
import com.trolltech.qt.gui.QApplication;
import com.trolltech.qt.gui.QFileDialog;
import com.trolltech.qt.gui.QListWidgetItem;
import com.trolltech.qt.gui.QMainWindow;
import com.trolltech.qt.gui.QPixmap;
import com.trolltech.qt.gui.QTabWidget;
import com.trolltech.qt.gui.QTableWidget;
import com.trolltech.qt.gui.QTableWidgetItem;
import com.trolltech.qt.gui.QWidget;

public class gameOptimizer extends QMainWindow {

	Ui_gameOptimizer ui = new Ui_gameOptimizer();

	QTableWidget tableWidgetProcesses = new QTableWidget(ui.processTab);

	static HashMap<String, Profile> profiles;						//HashMap for storing all the created profiles
	List<String> list;												//For table horizontal header
	static final String defaultDirName = "C:/GameOptimizer";		//Default directory
	static String dirName = defaultDirName;
	static int rowCount;											//Current number of rows
	Long time;														//For storing current time
	static boolean timerRunning;									//true when timer is started but not yet stopped



	public static void main(String[] args) {
		QApplication.initialize(args);

		fakeGames();												//Create mock profile data
		rowCount = 0;												//Initially zero rows
		timerRunning = false;										//Initially timer not running
		gameOptimizer testgameOptimizer = new gameOptimizer();		
		testgameOptimizer.show();
		QApplication.exec();
	}

	public gameOptimizer() {
		ui.setupUi(this);
		setupUI();
		ui.tabWidget.setCurrentWidget(ui.mainTab);
		// Connect ui interaction to methods
		ui.processesComboBox.currentIndexChanged.connect(this, "processesComboBoxChanged(int)");
		ui.processesApplyPushButton.clicked.connect(this,"processesApplyClicked()");
		ui.screenshotChangePushButton.clicked.connect(this, "screenshotChangeClicked()");
		ui.screenshotViewPushButton.clicked.connect(this,"screenshotViewClicked()");
		ui.gamesListWidget.currentItemChanged.connect(this, "gamesListItemChanged(QListWidgetItem,QListWidgetItem)");
		ui.gameScreenshotViewPushButton.clicked.connect(this,"gamesViewClicked()");
		ui.gameProcessesPushButton.clicked.connect(this,"gamesProcessesClicked()");
		ui.gamesNewPushButton.clicked.connect(this,"addNewGame()");
		ui.gamesStartStopPushButton.clicked.connect(this, "timer()");
		// Fill the list with the current games
		gamesListPopulate();



	}

	public gameOptimizer(QWidget parent) {
		super(parent);
		ui.setupUi(this);
	}

	
	public void setupUI(){
		
		//Set up tab widget
		ui.tabWidget.setTabPosition(QTabWidget.TabPosition.South);
		//Set tabs text
		ui.tabWidget.setTabText(0,"Main");
		ui.tabWidget.setTabText(1,"Processes");
		ui.tabWidget.setTabText(2,"Screenshots");
		ui.tabWidget.setTabText(3,"Games");
		
		//set up main tab
		ui.MainLabel.setScaledContents(true);
		ui.MainLabel.setPixmap(new QPixmap("classpath:/GO.bmp"));
		
        //Set up processes tab
		//Mock table data
		list = Arrays.asList("Name", "CPU", "Memory", "Disk", "Network", "Kill");
		ui.tableWidgetProcesses.setRowCount(this.rowCount);
		ui.tableWidgetProcesses.setColumnCount(list.size());
		ui.tableWidgetProcesses.setHorizontalHeaderLabels(list);
		
		//Set up screenshot tab
		ui.screenshotFolderLineEdit.setText(dirName);
		ui.screenshotHotkeyLineEdit.setText("CTRL + ALT + C");

		//Set up combo
		ui.screenshotTypeComboBox.addItem("JPG");
		ui.screenshotTypeComboBox.addItem("BMP");
		ui.screenshotTypeComboBox.addItem("PNG");

		//Set up games tab
		ui.gameScreenshotLineEdit.setText(dirName);

		//Create mock processes data
		fakeProcesses();
		
	}

	/**
	 * When the combo box is changed the check boxes have to be
	 * set to the state from the profile related to the selected combo
	 * @param comboIndex New index of combo box
	 */
	public void processesComboBoxChanged(int comboIndex){
		String s = "";
		List<String> processes = new ArrayList<String>();
		processes.add("");
		
		Profile p = profiles.get(ui.processesComboBox.currentText());
		try{
			processes = p.getProcesses();
		}
		catch(NullPointerException e){}

		for(int i = 0; i < ui.tableWidgetProcesses.rowCount(); i++){
			s = ui.tableWidgetProcesses.item(i,0).text();
			if(processes.contains(s)){
				ui.tableWidgetProcesses.item(i, 5).setCheckState(Qt.CheckState.Checked);
			}
			else
				ui.tableWidgetProcesses.item(i, 5).setCheckState(Qt.CheckState.Unchecked);
		}

	}

	/**
	 * when the apply button is clicked the selected check boxes have
	 * to be saved to the profile processes list.
	 */
	public void processesApplyClicked(){
		String s = "";
		Profile p = profiles.get(ui.processesComboBox.currentText());
		List<String> processes = p.getProcesses();


		for(int i = 0; i < ui.tableWidgetProcesses.rowCount(); i++){
			if(ui.tableWidgetProcesses.item(i, 5).checkState() == Qt.CheckState.Checked){
				s = ui.tableWidgetProcesses.item(i,0).text();
				if(!processes.contains(s)){
					processes.add(s);
					p.setProcesses(processes);
				}
			}
			else{
				s = ui.tableWidgetProcesses.item(i,0).text();
				if(processes.contains(s)){
					processes.remove(s);
					p.setProcesses(processes);
				}
			}
		}
	}

	/**
	 * A dialog is opened to choose the folder where to save screenshots
	 * if none is selected the folder is returned to the default value.
	 */
	public void screenshotChangeClicked(){
		String folderName = "";
		if( ! ui.screenshotFolderLineEdit.text().equals("") 
				&& ! ui.screenshotFolderLineEdit.text().equals("No Screenshots saved yet!")){
			dirName = ui.screenshotFolderLineEdit.text();
			folderName = QFileDialog.getExistingDirectory(this,tr("Find Files"), ui.screenshotFolderLineEdit.text());
		}
		else{
			folderName = QFileDialog.getExistingDirectory(this);
		}
		System.out.println(folderName);
		if(folderName.isEmpty())
			folderName = defaultDirName;
		dirName = folderName;
		ui.screenshotFolderLineEdit.setText(folderName);
	}

	/**
	 * When view is clicked if the folder exists an explorer dialog
	 * is opened at that folder. If it doesn't exist a message is displayed
	 * that no screenshots have been saved hence no directory yet been created.
	 */
	public void screenshotViewClicked(){
		String folderName = ui.screenshotFolderLineEdit.text();
		try{
			if(!folderName.equals(""))
				Desktop.getDesktop().open(new File(folderName));
		}catch(IOException e)
		{

		}
		catch(IllegalArgumentException e){
			ui.screenshotFolderLineEdit.setText("No Screenshots saved yet!");
		}

	}

	/**
	 * When view is clicked if the folder exists an explorer dialog
	 * is opened at that folder. If it doesn't exist a message is displayed
	 * that no screenshots have been saved hence no directory yet been created.
	 */
	public void gamesViewClicked(){
		String folderName = ui.gameScreenshotLineEdit.text();
		try{
			if(!folderName.equals(""))
				Desktop.getDesktop().open(new File(folderName));
		}catch(IOException e){

		}
		catch(IllegalArgumentException e){
			ui.gameScreenshotLineEdit.setText("No Screenshots saved yet!");
		}
	}

	/**
	 * When processes is clicked the tab is changed to the processes tab.
	 * The processes combo box is set to the selected profile.
	 * If no profile is selected in the list of the game tab then when pressed nothing happens.
	 */
	public void gamesProcessesClicked(){

		if(ui.gamesListWidget.currentItem() != null){

			int index = 0, i = 0;

			Set<String> s = profiles.keySet();
			Object[] o = s.toArray();

			while(!(o[i].toString().equals(ui.gamesListWidget.currentItem().text()))){
				index = ++i;
			}

			ui.processesComboBox.setCurrentIndex(index);
			ui.tabWidget.setCurrentWidget(ui.processTab);
		}
	}

	
	/**
	 * Fill the games list with the created profiles
	 */
	public void gamesListPopulate(){
		ui.gamesListWidget.clear();
		ui.processesComboBox.clear();
		Set<String> s = profiles.keySet();
		Object[] o = s.toArray();
		for(int i = 0; i < o.length; i++){
			String a = o[i].toString();
			ui.gamesListWidget.addItem(profiles.get(a).getName());
			ui.processesComboBox.addItem(profiles.get(a).getName());
		}
	}

	/**
	 * When a profile is selected from the games list the profile data is filled
	 * with it's values for name, time played and screenshot save path.
	 * @param current
	 * @param previous
	 */
	public void gamesListItemChanged(QListWidgetItem current, QListWidgetItem previous){
		if(current != null){
			ui.gameLineEdit.setText(current.text());
			ui.gameScreenshotLineEdit.setText(dirName+"/"+profiles.get(current.text()).getName());
			Profile p = profiles.get(ui.gamesListWidget.currentItem().text());
			ui.gamesTimeEdit.setTime(createQTime(p.getTime()));
		}
		
	}

	/**
	 * Opens an explorer dialog to select a folder of a game, the folder
	 * name will be the name for its profile
	 */
	public void addNewGame(){
		String folderName = QFileDialog.getExistingDirectory(this,tr("Find Files"),"C:/");

		String[] aux = folderName.split("/");
		folderName = aux[aux.length-1];
		
		if(!profiles.containsKey(folderName)){
			Profile p = new Profile(folderName);
			profiles.put(p.getName(), p);
		}
		gamesListPopulate();
	
	}

	/**
	 * If the timer isn't running then it is started, if it's already running
	 * then it's stopped and the time is saved to the profile. 
	 */
	public void timer(){

		Profile p = profiles.get(ui.gamesListWidget.currentItem().text());
		int totalTime = p.getTime();

		if(!timerRunning){
			time = System.currentTimeMillis();
			timerRunning = true;
		}else{
			time = System.currentTimeMillis() - time;
			totalTime += time;
			p.setTime(totalTime);
			timerRunning = false;
		}

		ui.gamesTimeEdit.setTime(createQTime(totalTime));
	
	}

	/**
	 * Given a time in milliseconds it returns a QTime
	 * @param time
	 * @return
	 */
	public QTime createQTime(int time){
		// convert time in ms to hours, minutes and seconds
		int h = time / (1000*3600);
		int m = (time % (1000*3600))/(1000*60);
		int s = ((time % (1000*3600)) % (1000*60)) / 1000;

		return new QTime(h,m,s);
	}

	/**
	 * Adds a process with its information to the table
	 * @param row
	 * @param name
	 * @param cpu
	 * @param memory
	 * @param disk
	 * @param network
	 */
	public void addToProcessesTable(int row, String name, String cpu, String memory, String disk, String network){
		ui.tableWidgetProcesses.setRowCount(++this.rowCount);
		//add to first column
		QTableWidgetItem newItem = new QTableWidgetItem(name);
		ui.tableWidgetProcesses.setItem(row, 0, newItem); 
		//add to second column
		newItem = new QTableWidgetItem(cpu);
		ui.tableWidgetProcesses.setItem(row, 1, newItem);
		//add to third column
		newItem = new QTableWidgetItem(memory);
		ui.tableWidgetProcesses.setItem(row, 2, newItem);
		//add to fourth column
		newItem = new QTableWidgetItem(disk);
		ui.tableWidgetProcesses.setItem(row, 3, newItem);
		//add to fifth column
		newItem = new QTableWidgetItem(network);
		ui.tableWidgetProcesses.setItem(row, 4, newItem);
		//add checkbox to sixth column
		QTableWidgetItem cBox = new QTableWidgetItem();
		cBox.setCheckState(Qt.CheckState.Unchecked);
		ui.tableWidgetProcesses.setItem(row, 5, new QTableWidgetItem(cBox));
	}
	
	/**
	 * Create mock data for games
	 */
	public static void fakeGames(){
		profiles = new HashMap<String, Profile>();
		Profile profile = new Profile("FIFA");
		List<String> processes = new ArrayList<String>();
		processes.add("explorer.exe");
		profile.setProcesses(processes);
		profiles.put(profile.getName(),profile);
		profile = new Profile("Battlefield 3");
		processes = new ArrayList<String>();
		processes.add("java.exe");
		profile.setProcesses(processes);
		profiles.put(profile.getName(),profile);
	}
	
	/**
	 * Create mock processes table data
	 */
	public void fakeProcesses(){
		addToProcessesTable(0,"explorer.exe","6%","45 MB","0 MB/S", "0 Mbps");
		addToProcessesTable(1,"Google Chrome","0%","245 MB","116 MB/S", "211 Mbps");
		addToProcessesTable(2, "java.exe", "5%", "31.4 MB","0 MB/S", "0 Mbps");
		addToProcessesTable(3,"teamspeak.exe","1%","89MB","0 MB/S", "312 Mbps");
		addToProcessesTable(4,"bf3.exe","76%","1166 MB","0 MB/S", "566 Mbps");
		addToProcessesTable(5,"sublime_text.exe","0%","23 MB","0 MB/S", "0 Mbps");
		addToProcessesTable(6,"CCC.exe","4.1%","8.4 MB","0 MB/S", "0 Mbps");
		addToProcessesTable(7,"Dropbox.exe","0%","81.5 MB","23 MB/S", "11 Mbps");
		addToProcessesTable(8,"WmiPrvSE.exe","0%","2.1 MB","0 MB/S", "0 Mbps");
		
	}
}
