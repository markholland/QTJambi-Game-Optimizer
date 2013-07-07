/**
 * A mock up for a program that allows you to save screenshots
 * and kill processes prior to playing a video game. It also allows 
 * the timing the amount played for each game profile.
 * 
 * @author Mark Holland, Álvaro Ponce Arévalo
 */

import java.util.ArrayList;
import java.util.List;


public class Profile {
	private String name;
	private int time;
	private List<String> processes;
	
	
	public Profile(String name){
		this.name = name;
		this.time = 0;
		this.processes = new ArrayList<String>();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}


	public List<String> getProcesses() {
		return processes;
	}


	public void setProcesses(List<String> processes) {
		this.processes = processes;
	}


	
	
	
}
