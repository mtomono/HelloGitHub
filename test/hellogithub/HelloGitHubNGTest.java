/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hellogithub;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author masao
 */
public class HelloGitHubNGTest {
    
    public HelloGitHubNGTest() {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @Test
    public void testMain() {
    }

    @Test
    public void testGet() {
        assertEquals("GitHub", new HelloGitHub().get());
    }
    
}
