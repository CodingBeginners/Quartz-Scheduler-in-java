package com.codingbeginner.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MethodExceuteJOB implements Job
{
	public void execute(JobExecutionContext context)
	throws JobExecutionException {

		System.out.println("Quartz-Scheduler Sample Code......!! ");

	}

}