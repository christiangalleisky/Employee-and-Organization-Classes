package edu.gcccd.csis;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNull;

/**
 * Tests for a system that can track employee information for two organizations.
 * The Employee information you must (at least) track, is as follows:
 * Name, Job Title, Organization they work for, Birthday
 *
 * As for the Organization that the Employee works for, you must also (at the very least) track this information:
 * Organization Name, Number of Employees
 *
 * The system must be able to properly compare any two employees against each other to determine,
 * if they are the same Person. This means that if you compared two People,
 * with the same Name, Birthday, and Organization, the system should think that they are equal to one another.
 * If any of these properties are different, then the two People are not the same Person.
 * The same rules apply to comparing Organizations to one another.
 * Organizations with the same Organization name are to be thought of as equal,
 * different names means different organizations.
 */
public class StructureTest {



    @Test
    public void employeeComplete() {
        //
        // check that an employee's attribute are complete and make sense.
        // assertTrue( employee is alive and company complies with child labor laws ...;
        //...
        Employee e1 = new Employee("Chris", "Galleisky", "Programmer",
                                    "Microsoft", 16, 3, 1990, true);
        System.out.println(e1.toString());
        assertTrue(e1.getIsAlive());
        assertTrue(e1.getIsOldEnoughToWork(2,3,2018));
    }
    /**
     * Check Employee Equality
     */
    @Test
    public void employeeEq() {
        Employee e1 = new Employee("Chris", "Galleisky", "Programmer",
                                    "Microsoft", 16, 3, 1990, true);
        Employee e2 = new Employee("Chris", "Galleisky", "Programmer",
                                    "Microsoft", 16, 3, 1990, true);

        // Create employee e1,
        // Create another employee e2 that matches the specific criteria for equality
        assertTrue(e1.equals(e2));

        // modify employee e2 (eg. by making her/him join the other company
        e2.setOrgOneWorksFor("Google");
        assertNotEquals(e1, e2);

    }

    /**
     * Check Company Equality
     */
    @Test
    public void companyEq() {
        // Create company c1,
        // Create company employee c2 that matches the specific criteria for equality
        Organization c1 = new Organization("Microsoft",10000);
        Organization c2 = new Organization("Microsoft",10000);
        assertTrue(c1.equals(c2));

        // modify company c2, i.e. change its name or create another company with a different name ..
        c2.setOrgName("Google");
        assertNotEquals(c1, c2);

    }

    @Test
    public void companyComplete() {
        // check that a companies' attribute are complete and make sense.
        Organization c1 = new Organization("Microsoft",10000);
        System.out.println(c1.toString());
    }
}
