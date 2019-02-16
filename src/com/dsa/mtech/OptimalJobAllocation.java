/**
 * @author shivaak on 16-Feb-2019
 *
 */
package com.dsa.mtech;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 * @author shivaak on 16-Feb-2019
 *
 */
public class OptimalJobAllocation {


	private static int allocateJobs(List<Machine> machines, List<Job> jobs) {

		PriorityQueue<Machine> q = new PriorityQueue<Machine>(mc);
		q.addAll(machines); // add all machines to the queue. Right now there is no jobs assigned to any machine;
		
		for(Job j : jobs) {
			Machine machine = q.remove();
			machine.assign(j);
			q.add(machine);
		}
		
		//get the last element of the queue
		Iterator<Machine> it = q.iterator();
		Machine lastVisited = null;
		while(it.hasNext()) {
			lastVisited = it.next();
		}
		
		if(lastVisited!=null) {
			System.out.println("Total time consumed : " + lastVisited.getTotalExecutionTime());
		}else {
			System.out.println("No Machines Found");
		}
			
		return 0;
	}


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		List<Job> jobs = new ArrayList<Job>();
		List<Machine> machines = new ArrayList<Machine>();

		int noOfMachines = in.nextInt();
		for(int i=1;i<=noOfMachines; i++) {
			machines.add(new Machine());
		}
		
		int noOfJobs = in.nextInt();
		for(int i=1;i<=noOfJobs; i++) {
			int t = in.nextInt();
			jobs.add(new Job(i, t));
		}

		int optimalTime = allocateJobs(machines, jobs);
		in.close();

	}

	private static Comparator<Machine> mc = (m1, m2) -> {
		List<Job> m1Jobs = m1.getAssignedJobs();
		List<Job> m2Jobs = m2.getAssignedJobs();

		int totalTime_m1 = m1Jobs.stream().mapToInt(o -> o.getTime()).sum();
		int totalTime_m2 = m2Jobs.stream().mapToInt(o -> o.getTime()).sum();

		return totalTime_m1 - totalTime_m2;
	};


	private static class Machine{
		private List<Job> jobs = new ArrayList<Job>();
		private int totalExecutionTime = 0;
		public void assign(Job job) {
			jobs.add(job);
			totalExecutionTime += job.getTime();
		}
		public List<Job> getAssignedJobs(){
			return jobs;
		}
		public int getTotalExecutionTime() {
			return totalExecutionTime;
		}
	}

	private static class Job{
		private int jobId;
		private int time;
		public Job(int jobId, int time) {
			super();
			this.jobId = jobId;
			this.time = time;
		}
		public int getJobId() {
			return jobId;
		}
		public void setJobId(int jobId) {
			this.jobId = jobId;
		}
		public int getTime() {
			return time;
		}
		public void setTime(int time) {
			this.time = time;
		}
	}

}
