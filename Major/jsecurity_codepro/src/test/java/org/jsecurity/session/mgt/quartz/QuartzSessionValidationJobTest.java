package org.jsecurity.session.mgt.quartz;

import java.util.Date;
import org.junit.*;
import static org.junit.Assert.*;
import org.quartz.Calendar;
import org.quartz.CronTrigger;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.JobExecutionContext;
import org.quartz.Scheduler;
import org.quartz.Trigger;
import org.quartz.core.QuartzScheduler;
import org.quartz.core.SchedulingContext;
import org.quartz.impl.StdScheduler;
import org.quartz.impl.calendar.AnnualCalendar;
import org.quartz.spi.TriggerFiredBundle;

/**
 * The class <code>QuartzSessionValidationJobTest</code> contains tests for the class <code>{@link QuartzSessionValidationJob}</code>.
 *
 * @generatedBy CodePro at 4/19/14 3:10 PM
 * @author Jeshua
 * @version $Revision: 1.0 $
 */
public class QuartzSessionValidationJobTest {
	/**
	 * Run the QuartzSessionValidationJob() constructor test.
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testQuartzSessionValidationJob_1()
		throws Exception {
		QuartzSessionValidationJob result = new QuartzSessionValidationJob();
		assertNotNull(result);
		// add additional test code here
	}

	/**
	 * Run the void execute(JobExecutionContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testExecute_1()
		throws Exception {
		QuartzSessionValidationJob fixture = new QuartzSessionValidationJob();
		JobExecutionContext context = new JobExecutionContext(new StdScheduler((QuartzScheduler) null, new SchedulingContext()), new TriggerFiredBundle(new JobDetail(), new CronTrigger(), new AnnualCalendar(), true, new Date(), new Date(), new Date(), new Date()), new QuartzSessionValidationJob());

		fixture.execute(context);

		// add additional test code here
	}

	/**
	 * Run the void execute(JobExecutionContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testExecute_2()
		throws Exception {
		QuartzSessionValidationJob fixture = new QuartzSessionValidationJob();
		JobExecutionContext context = new JobExecutionContext(new StdScheduler((QuartzScheduler) null, new SchedulingContext()), new TriggerFiredBundle(new JobDetail(), new CronTrigger(), new AnnualCalendar(), true, new Date(), new Date(), new Date(), new Date()), new QuartzSessionValidationJob());

		fixture.execute(context);

		// add additional test code here
	}

	/**
	 * Run the void execute(JobExecutionContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testExecute_3()
		throws Exception {
		QuartzSessionValidationJob fixture = new QuartzSessionValidationJob();
		JobExecutionContext context = new JobExecutionContext(new StdScheduler((QuartzScheduler) null, new SchedulingContext()), new TriggerFiredBundle(new JobDetail(), new CronTrigger(), new AnnualCalendar(), true, new Date(), new Date(), new Date(), new Date()), new QuartzSessionValidationJob());

		fixture.execute(context);

		// add additional test code here
	}

	/**
	 * Run the void execute(JobExecutionContext) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Test
	public void testExecute_4()
		throws Exception {
		QuartzSessionValidationJob fixture = new QuartzSessionValidationJob();
		JobExecutionContext context = new JobExecutionContext(new StdScheduler((QuartzScheduler) null, new SchedulingContext()), new TriggerFiredBundle(new JobDetail(), new CronTrigger(), new AnnualCalendar(), true, new Date(), new Date(), new Date(), new Date()), new QuartzSessionValidationJob());

		fixture.execute(context);

		// add additional test code here
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@Before
	public void setUp()
		throws Exception {
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	@After
	public void tearDown()
		throws Exception {
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 4/19/14 3:10 PM
	 */
	public static void main(String[] args) {
		new org.junit.runner.JUnitCore().run(QuartzSessionValidationJobTest.class);
	}
}