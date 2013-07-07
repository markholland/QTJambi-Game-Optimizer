/********************************************************************************
** Form generated from reading ui file 'gameOptimizer.jui'
**
** Created: Fri 10. May 14:36:43 2013
**      by: Qt User Interface Compiler version 4.5.2
**
** WARNING! All changes made in this file will be lost when recompiling ui file!
********************************************************************************/

import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;

public class Ui_gameOptimizer implements com.trolltech.qt.QUiForm<QMainWindow>
{
    public QWidget centralwidget;
    public QVBoxLayout verticalLayout_6;
    public QHBoxLayout horizontalLayout;
    public QTabWidget tabWidget;
    public QWidget mainTab;
    public QLabel MainLabel;
    public QWidget processTab;
    public QTableWidget tableWidgetProcesses;
    public QComboBox processesComboBox;
    public QFrame line_7;
    public QWidget widget;
    public QHBoxLayout horizontalLayout_8;
    public QPushButton processesRefreshPushButton;
    public QSpacerItem horizontalSpacer_5;
    public QPushButton processesApplyPushButton;
    public QWidget screenshotTab;
    public QWidget layoutWidget;
    public QVBoxLayout verticalLayout_7;
    public QVBoxLayout verticalLayout;
    public QVBoxLayout verticalLayout_5;
    public QVBoxLayout verticalLayout_4;
    public QLabel screenshotFolderLabel;
    public QLineEdit screenshotFolderLineEdit;
    public QHBoxLayout horizontalLayout_3;
    public QSpacerItem horizontalSpacer_3;
    public QPushButton screenshotChangePushButton;
    public QSpacerItem horizontalSpacer;
    public QPushButton screenshotViewPushButton;
    public QSpacerItem horizontalSpacer_2;
    public QFrame line_2;
    public QHBoxLayout horizontalLayout_2;
    public QVBoxLayout verticalLayout_3;
    public QLabel screenshotHotkeyLabel;
    public QLineEdit screenshotHotkeyLineEdit;
    public QFrame line;
    public QVBoxLayout verticalLayout_2;
    public QLabel screenshotTypeLabel;
    public QComboBox screenshotTypeComboBox;
    public QWidget gameTab;
    public QGroupBox gamesGroupBox;
    public QListWidget gamesListWidget;
    public QWidget layoutWidget1;
    public QVBoxLayout verticalLayout_9;
    public QLabel gameScreenshotLabel;
    public QHBoxLayout horizontalLayout_4;
    public QLineEdit gameScreenshotLineEdit;
    public QPushButton gameScreenshotViewPushButton;
    public QWidget layoutWidget2;
    public QHBoxLayout horizontalLayout_5;
    public QLabel processButtonLabel;
    public QPushButton gameProcessesPushButton;
    public QWidget layoutWidget3;
    public QHBoxLayout horizontalLayout_6;
    public QPushButton gamesNewPushButton;
    public QSpacerItem horizontalSpacer_4;
    public QPushButton gamesStartStopPushButton;
    public QFrame line_3;
    public QFrame line_4;
    public QFrame line_5;
    public QFrame line_6;
    public QWidget widget1;
    public QHBoxLayout horizontalLayout_7;
    public QVBoxLayout verticalLayout_8;
    public QLabel gameLabel;
    public QLineEdit gameLineEdit;
    public QVBoxLayout verticalLayout_10;
    public QLabel gamesTimeLabel;
    public QTimeEdit gamesTimeEdit;
    public QMenuBar menubar;
    public QStatusBar statusbar;

    public Ui_gameOptimizer() { super(); }

    public void setupUi(QMainWindow gameOptimizer)
    {
        gameOptimizer.setObjectName("gameOptimizer");
        gameOptimizer.resize(new QSize(726, 554).expandedTo(gameOptimizer.minimumSizeHint()));
        QSizePolicy sizePolicy = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.MinimumExpanding, com.trolltech.qt.gui.QSizePolicy.Policy.MinimumExpanding);
        sizePolicy.setHorizontalStretch((byte)0);
        sizePolicy.setVerticalStretch((byte)0);
        sizePolicy.setHeightForWidth(gameOptimizer.sizePolicy().hasHeightForWidth());
        gameOptimizer.setSizePolicy(sizePolicy);
        centralwidget = new QWidget(gameOptimizer);
        centralwidget.setObjectName("centralwidget");
        verticalLayout_6 = new QVBoxLayout(centralwidget);
        verticalLayout_6.setObjectName("verticalLayout_6");
        horizontalLayout = new QHBoxLayout();
        horizontalLayout.setObjectName("horizontalLayout");
        tabWidget = new QTabWidget(centralwidget);
        tabWidget.setObjectName("tabWidget");
        QSizePolicy sizePolicy1 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.MinimumExpanding);
        sizePolicy1.setHorizontalStretch((byte)0);
        sizePolicy1.setVerticalStretch((byte)0);
        sizePolicy1.setHeightForWidth(tabWidget.sizePolicy().hasHeightForWidth());
        tabWidget.setSizePolicy(sizePolicy1);
        mainTab = new QWidget();
        mainTab.setObjectName("mainTab");
        MainLabel = new QLabel(mainTab);
        MainLabel.setObjectName("MainLabel");
        MainLabel.setGeometry(new QRect(5, 3, 691, 461));
        tabWidget.addTab(mainTab, com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Tab 1", null));
        processTab = new QWidget();
        processTab.setObjectName("processTab");
        tableWidgetProcesses = new QTableWidget(processTab);
        tableWidgetProcesses.setObjectName("tableWidgetProcesses");
        tableWidgetProcesses.setGeometry(new QRect(30, 30, 651, 311));
        tableWidgetProcesses.setShowGrid(true);
        tableWidgetProcesses.setGridStyle(com.trolltech.qt.core.Qt.PenStyle.SolidLine);
        tableWidgetProcesses.setCornerButtonEnabled(true);
        tableWidgetProcesses.setRowCount(12);
        tableWidgetProcesses.setColumnCount(4);
        processesComboBox = new QComboBox(processTab);
        processesComboBox.setObjectName("processesComboBox");
        processesComboBox.setGeometry(new QRect(570, 360, 111, 22));
        QSizePolicy sizePolicy2 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy2.setHorizontalStretch((byte)0);
        sizePolicy2.setVerticalStretch((byte)0);
        sizePolicy2.setHeightForWidth(processesComboBox.sizePolicy().hasHeightForWidth());
        processesComboBox.setSizePolicy(sizePolicy2);
        processesComboBox.setMinimumSize(new QSize(100, 0));
        line_7 = new QFrame(processTab);
        line_7.setObjectName("line_7");
        line_7.setGeometry(new QRect(40, 380, 641, 20));
        line_7.setFrameShape(QFrame.Shape.HLine);
        line_7.setFrameShadow(QFrame.Shadow.Sunken);
        widget = new QWidget(processTab);
        widget.setObjectName("widget");
        widget.setGeometry(new QRect(120, 410, 464, 51));
        horizontalLayout_8 = new QHBoxLayout(widget);
        horizontalLayout_8.setObjectName("horizontalLayout_8");
        processesRefreshPushButton = new QPushButton(widget);
        processesRefreshPushButton.setObjectName("processesRefreshPushButton");

        horizontalLayout_8.addWidget(processesRefreshPushButton);

        horizontalSpacer_5 = new QSpacerItem(300, 20, com.trolltech.qt.gui.QSizePolicy.Policy.MinimumExpanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_8.addItem(horizontalSpacer_5);

        processesApplyPushButton = new QPushButton(widget);
        processesApplyPushButton.setObjectName("processesApplyPushButton");

        horizontalLayout_8.addWidget(processesApplyPushButton);

        tabWidget.addTab(processTab, com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Tab 2", null));
        screenshotTab = new QWidget();
        screenshotTab.setObjectName("screenshotTab");
        layoutWidget = new QWidget(screenshotTab);
        layoutWidget.setObjectName("layoutWidget");
        layoutWidget.setGeometry(new QRect(120, 110, 471, 201));
        verticalLayout_7 = new QVBoxLayout(layoutWidget);
        verticalLayout_7.setObjectName("verticalLayout_7");
        verticalLayout = new QVBoxLayout();
        verticalLayout.setObjectName("verticalLayout");
        verticalLayout_5 = new QVBoxLayout();
        verticalLayout_5.setObjectName("verticalLayout_5");
        verticalLayout_4 = new QVBoxLayout();
        verticalLayout_4.setObjectName("verticalLayout_4");
        screenshotFolderLabel = new QLabel(layoutWidget);
        screenshotFolderLabel.setObjectName("screenshotFolderLabel");
        screenshotFolderLabel.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));

        verticalLayout_4.addWidget(screenshotFolderLabel);

        screenshotFolderLineEdit = new QLineEdit(layoutWidget);
        screenshotFolderLineEdit.setObjectName("screenshotFolderLineEdit");
        QSizePolicy sizePolicy3 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy3.setHorizontalStretch((byte)0);
        sizePolicy3.setVerticalStretch((byte)0);
        sizePolicy3.setHeightForWidth(screenshotFolderLineEdit.sizePolicy().hasHeightForWidth());
        screenshotFolderLineEdit.setSizePolicy(sizePolicy3);
        screenshotFolderLineEdit.setMinimumSize(new QSize(40, 0));
        screenshotFolderLineEdit.setLayoutDirection(com.trolltech.qt.core.Qt.LayoutDirection.LeftToRight);
        screenshotFolderLineEdit.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));

        verticalLayout_4.addWidget(screenshotFolderLineEdit);

        horizontalLayout_3 = new QHBoxLayout();
        horizontalLayout_3.setObjectName("horizontalLayout_3");
        horizontalSpacer_3 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_3.addItem(horizontalSpacer_3);

        screenshotChangePushButton = new QPushButton(layoutWidget);
        screenshotChangePushButton.setObjectName("screenshotChangePushButton");

        horizontalLayout_3.addWidget(screenshotChangePushButton);

        horizontalSpacer = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_3.addItem(horizontalSpacer);

        screenshotViewPushButton = new QPushButton(layoutWidget);
        screenshotViewPushButton.setObjectName("screenshotViewPushButton");

        horizontalLayout_3.addWidget(screenshotViewPushButton);

        horizontalSpacer_2 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_3.addItem(horizontalSpacer_2);


        verticalLayout_4.addLayout(horizontalLayout_3);


        verticalLayout_5.addLayout(verticalLayout_4);


        verticalLayout.addLayout(verticalLayout_5);

        line_2 = new QFrame(layoutWidget);
        line_2.setObjectName("line_2");
        QSizePolicy sizePolicy4 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Ignored);
        sizePolicy4.setHorizontalStretch((byte)0);
        sizePolicy4.setVerticalStretch((byte)0);
        sizePolicy4.setHeightForWidth(line_2.sizePolicy().hasHeightForWidth());
        line_2.setSizePolicy(sizePolicy4);
        line_2.setFrameShape(QFrame.Shape.HLine);
        line_2.setFrameShadow(QFrame.Shadow.Sunken);

        verticalLayout.addWidget(line_2);


        verticalLayout_7.addLayout(verticalLayout);

        horizontalLayout_2 = new QHBoxLayout();
        horizontalLayout_2.setObjectName("horizontalLayout_2");
        verticalLayout_3 = new QVBoxLayout();
        verticalLayout_3.setObjectName("verticalLayout_3");
        screenshotHotkeyLabel = new QLabel(layoutWidget);
        screenshotHotkeyLabel.setObjectName("screenshotHotkeyLabel");

        verticalLayout_3.addWidget(screenshotHotkeyLabel);

        screenshotHotkeyLineEdit = new QLineEdit(layoutWidget);
        screenshotHotkeyLineEdit.setObjectName("screenshotHotkeyLineEdit");
        screenshotHotkeyLineEdit.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));
        screenshotHotkeyLineEdit.setReadOnly(true);

        verticalLayout_3.addWidget(screenshotHotkeyLineEdit);


        horizontalLayout_2.addLayout(verticalLayout_3);

        line = new QFrame(layoutWidget);
        line.setObjectName("line");
        line.setFrameShape(QFrame.Shape.HLine);
        line.setFrameShadow(QFrame.Shadow.Sunken);

        horizontalLayout_2.addWidget(line);

        verticalLayout_2 = new QVBoxLayout();
        verticalLayout_2.setObjectName("verticalLayout_2");
        screenshotTypeLabel = new QLabel(layoutWidget);
        screenshotTypeLabel.setObjectName("screenshotTypeLabel");
        screenshotTypeLabel.setAlignment(com.trolltech.qt.core.Qt.AlignmentFlag.createQFlags(com.trolltech.qt.core.Qt.AlignmentFlag.AlignCenter));

        verticalLayout_2.addWidget(screenshotTypeLabel);

        screenshotTypeComboBox = new QComboBox(layoutWidget);
        screenshotTypeComboBox.setObjectName("screenshotTypeComboBox");
        QSizePolicy sizePolicy5 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.Minimum, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy5.setHorizontalStretch((byte)0);
        sizePolicy5.setVerticalStretch((byte)0);
        sizePolicy5.setHeightForWidth(screenshotTypeComboBox.sizePolicy().hasHeightForWidth());
        screenshotTypeComboBox.setSizePolicy(sizePolicy5);
        screenshotTypeComboBox.setFrame(true);

        verticalLayout_2.addWidget(screenshotTypeComboBox);


        horizontalLayout_2.addLayout(verticalLayout_2);


        verticalLayout_7.addLayout(horizontalLayout_2);

        tabWidget.addTab(screenshotTab, com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Page", null));
        gameTab = new QWidget();
        gameTab.setObjectName("gameTab");
        gamesGroupBox = new QGroupBox(gameTab);
        gamesGroupBox.setObjectName("gamesGroupBox");
        gamesGroupBox.setGeometry(new QRect(60, 90, 261, 291));
        gamesListWidget = new QListWidget(gamesGroupBox);
        gamesListWidget.setObjectName("gamesListWidget");
        gamesListWidget.setGeometry(new QRect(20, 30, 221, 241));
        layoutWidget1 = new QWidget(gameTab);
        layoutWidget1.setObjectName("layoutWidget1");
        layoutWidget1.setGeometry(new QRect(370, 190, 271, 61));
        verticalLayout_9 = new QVBoxLayout(layoutWidget1);
        verticalLayout_9.setObjectName("verticalLayout_9");
        gameScreenshotLabel = new QLabel(layoutWidget1);
        gameScreenshotLabel.setObjectName("gameScreenshotLabel");

        verticalLayout_9.addWidget(gameScreenshotLabel);

        horizontalLayout_4 = new QHBoxLayout();
        horizontalLayout_4.setObjectName("horizontalLayout_4");
        gameScreenshotLineEdit = new QLineEdit(layoutWidget1);
        gameScreenshotLineEdit.setObjectName("gameScreenshotLineEdit");
        gameScreenshotLineEdit.setReadOnly(true);

        horizontalLayout_4.addWidget(gameScreenshotLineEdit);

        gameScreenshotViewPushButton = new QPushButton(layoutWidget1);
        gameScreenshotViewPushButton.setObjectName("gameScreenshotViewPushButton");

        horizontalLayout_4.addWidget(gameScreenshotViewPushButton);


        verticalLayout_9.addLayout(horizontalLayout_4);

        layoutWidget2 = new QWidget(gameTab);
        layoutWidget2.setObjectName("layoutWidget2");
        layoutWidget2.setGeometry(new QRect(370, 270, 271, 41));
        horizontalLayout_5 = new QHBoxLayout(layoutWidget2);
        horizontalLayout_5.setObjectName("horizontalLayout_5");
        processButtonLabel = new QLabel(layoutWidget2);
        processButtonLabel.setObjectName("processButtonLabel");

        horizontalLayout_5.addWidget(processButtonLabel);

        gameProcessesPushButton = new QPushButton(layoutWidget2);
        gameProcessesPushButton.setObjectName("gameProcessesPushButton");

        horizontalLayout_5.addWidget(gameProcessesPushButton);

        layoutWidget3 = new QWidget(gameTab);
        layoutWidget3.setObjectName("layoutWidget3");
        layoutWidget3.setGeometry(new QRect(370, 330, 271, 51));
        horizontalLayout_6 = new QHBoxLayout(layoutWidget3);
        horizontalLayout_6.setObjectName("horizontalLayout_6");
        gamesNewPushButton = new QPushButton(layoutWidget3);
        gamesNewPushButton.setObjectName("gamesNewPushButton");

        horizontalLayout_6.addWidget(gamesNewPushButton);

        horizontalSpacer_4 = new QSpacerItem(40, 20, com.trolltech.qt.gui.QSizePolicy.Policy.Expanding, com.trolltech.qt.gui.QSizePolicy.Policy.Minimum);

        horizontalLayout_6.addItem(horizontalSpacer_4);

        gamesStartStopPushButton = new QPushButton(layoutWidget3);
        gamesStartStopPushButton.setObjectName("gamesStartStopPushButton");
        QSizePolicy sizePolicy6 = new QSizePolicy(com.trolltech.qt.gui.QSizePolicy.Policy.MinimumExpanding, com.trolltech.qt.gui.QSizePolicy.Policy.Fixed);
        sizePolicy6.setHorizontalStretch((byte)0);
        sizePolicy6.setVerticalStretch((byte)0);
        sizePolicy6.setHeightForWidth(gamesStartStopPushButton.sizePolicy().hasHeightForWidth());
        gamesStartStopPushButton.setSizePolicy(sizePolicy6);

        horizontalLayout_6.addWidget(gamesStartStopPushButton);

        line_3 = new QFrame(gameTab);
        line_3.setObjectName("line_3");
        line_3.setGeometry(new QRect(370, 180, 271, 16));
        line_3.setFrameShape(QFrame.Shape.HLine);
        line_3.setFrameShadow(QFrame.Shadow.Sunken);
        line_4 = new QFrame(gameTab);
        line_4.setObjectName("line_4");
        line_4.setGeometry(new QRect(370, 260, 271, 16));
        line_4.setFrameShape(QFrame.Shape.HLine);
        line_4.setFrameShadow(QFrame.Shadow.Sunken);
        line_5 = new QFrame(gameTab);
        line_5.setObjectName("line_5");
        line_5.setGeometry(new QRect(370, 90, 271, 16));
        line_5.setFrameShape(QFrame.Shape.HLine);
        line_5.setFrameShadow(QFrame.Shadow.Sunken);
        line_6 = new QFrame(gameTab);
        line_6.setObjectName("line_6");
        line_6.setGeometry(new QRect(370, 320, 271, 16));
        line_6.setFrameShape(QFrame.Shape.HLine);
        line_6.setFrameShadow(QFrame.Shadow.Sunken);
        widget1 = new QWidget(gameTab);
        widget1.setObjectName("widget1");
        widget1.setGeometry(new QRect(370, 110, 271, 61));
        horizontalLayout_7 = new QHBoxLayout(widget1);
        horizontalLayout_7.setObjectName("horizontalLayout_7");
        verticalLayout_8 = new QVBoxLayout();
        verticalLayout_8.setObjectName("verticalLayout_8");
        gameLabel = new QLabel(widget1);
        gameLabel.setObjectName("gameLabel");

        verticalLayout_8.addWidget(gameLabel);

        gameLineEdit = new QLineEdit(widget1);
        gameLineEdit.setObjectName("gameLineEdit");
        gameLineEdit.setReadOnly(true);

        verticalLayout_8.addWidget(gameLineEdit);


        horizontalLayout_7.addLayout(verticalLayout_8);

        verticalLayout_10 = new QVBoxLayout();
        verticalLayout_10.setObjectName("verticalLayout_10");
        gamesTimeLabel = new QLabel(widget1);
        gamesTimeLabel.setObjectName("gamesTimeLabel");

        verticalLayout_10.addWidget(gamesTimeLabel);

        gamesTimeEdit = new QTimeEdit(widget1);
        gamesTimeEdit.setObjectName("gamesTimeEdit");
        gamesTimeEdit.setReadOnly(true);

        verticalLayout_10.addWidget(gamesTimeEdit);


        horizontalLayout_7.addLayout(verticalLayout_10);

        tabWidget.addTab(gameTab, com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Page", null));

        horizontalLayout.addWidget(tabWidget);


        verticalLayout_6.addLayout(horizontalLayout);

        gameOptimizer.setCentralWidget(centralwidget);
        menubar = new QMenuBar(gameOptimizer);
        menubar.setObjectName("menubar");
        menubar.setGeometry(new QRect(0, 0, 726, 21));
        gameOptimizer.setMenuBar(menubar);
        statusbar = new QStatusBar(gameOptimizer);
        statusbar.setObjectName("statusbar");
        gameOptimizer.setStatusBar(statusbar);
        retranslateUi(gameOptimizer);

        tabWidget.setCurrentIndex(0);


        gameOptimizer.connectSlotsByName();
    } // setupUi

    void retranslateUi(QMainWindow gameOptimizer)
    {
        gameOptimizer.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Game Optimizer", null));
        MainLabel.setText("");
        tabWidget.setTabText(tabWidget.indexOf(mainTab), com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Tab 1", null));
        tableWidgetProcesses.clear();
        tableWidgetProcesses.setColumnCount(4);
        tableWidgetProcesses.setRowCount(12);
        processesRefreshPushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Refesh", null));
        processesApplyPushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Apply", null));
        tabWidget.setTabText(tabWidget.indexOf(processTab), com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Tab 2", null));
        screenshotFolderLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Folder to save the photos:", null));
        screenshotChangePushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Change", null));
        screenshotViewPushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "View", null));
        screenshotHotkeyLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Screen capture hotkey:", null));
        screenshotTypeLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Type of picture:", null));
        tabWidget.setTabText(tabWidget.indexOf(screenshotTab), com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Page", null));
        gamesGroupBox.setTitle(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Games", null));
        gameScreenshotLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Screenshots path:", null));
        gameScreenshotViewPushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "View", null));
        processButtonLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Processes configuration", null));
        gameProcessesPushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Processes", null));
        gamesNewPushButton.setToolTip("");
        gamesNewPushButton.setWhatsThis("");
        gamesNewPushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Add game", null));
        gamesStartStopPushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Start / Stop", null));
        gameLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Game:", null));
        gamesTimeLabel.setText(com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Time played:", null));
        tabWidget.setTabText(tabWidget.indexOf(gameTab), com.trolltech.qt.core.QCoreApplication.translate("gameOptimizer", "Page", null));
    } // retranslateUi

}

