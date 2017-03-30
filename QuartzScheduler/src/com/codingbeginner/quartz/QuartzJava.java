package com.codingbeginner.quartz;


import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
public class QuartzJava {
	public void startQuartzShedule()throws Exception
	{
		//execute certain time interval
		
		JobDetail job = JobBuilder.newJob(MethodExceuteJOB.class)
			.withIdentity("codingbeginner_Job", "qaurtz_group1").build();

		Trigger trigger = TriggerBuilder
			.newTrigger()
			.withIdentity("codingbeginner_Trigger", "qaurtz_group1")
			.withSchedule(
				SimpleScheduleBuilder.simpleSchedule()
					.withIntervalInMilliseconds(10).repeatForever())
			.build();

		// schedule it
		Scheduler scheduler = new StdSchedulerFactory().getScheduler();
		scheduler.start();
		scheduler.scheduleJob(job, trigger);

	}
	
	public static void main(String[] args) throws Exception {
		
		QuartzJava quartzJ=new QuartzJava();
		quartzJ.startQuartzShedule();
		
	}
}
