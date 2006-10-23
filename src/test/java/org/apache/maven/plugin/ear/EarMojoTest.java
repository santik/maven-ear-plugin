package org.apache.maven.plugin.ear;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;
import org.apache.maven.project.MavenProject;

import java.io.File;
import java.util.Properties;

/**
 * @author Stephane Nicoll <stephane.nicoll@bsb.com>
 * @author $Author: sni $ (last edit)
 * @version $Revision: 1.5 $
 */
public class EarMojoTest
    extends AbstractEarPluginTestCase
{

    /**
     * Simple project with an EJB artifact
     */
    public void testProject01()
        throws Exception
    {
        doTestProject( "project-01", new String[]{"ejb-sample-one-1.0.jar"} );
    }

    public void testProject02()
        throws Exception
    {
        // See http://jira.codehaus.org/browse/MNG-2571 - Uncomment to reproduce 
        //doTestProject( "project-02", new String[]{"APP-INF/lib/ejb-sample-one-1.0.jar, ejb-sample-two.jar"});
    }

    /**
     * Test the classifier functionnality
     */
    public void testProject03()
        throws Exception
    {
        doTestProject( "project-03", new String[]{"ejb-sample-one-1.0-classified.jar"} );
    }

    /**
     * Test the classifier functionnality
     */
    public void testProject04()
        throws Exception
    {
        doTestProject( "project-04", new String[]{"ejb-sample-one-1.0.jar","sar-sample-one-1.0.sar"}, new boolean[]{false, true});
    }




}