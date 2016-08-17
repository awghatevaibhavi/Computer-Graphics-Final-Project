//
//  textureParams.java
//
//  Created by Joe Geigel on 1/23/13.
//
//  Contributor:  VAIBHAVI AWGHATE
//
//  Simple class for setting up the textures for the textures
//  assignment.
//
//  20155 version
//

import java.io.*;
import javax.media.opengl.*;
import javax.media.opengl.awt.GLCanvas;
import javax.media.opengl.fixedfunc.*;
import com.jogamp.opengl.util.texture.*;

public class textureParams
{

    // Add any data members you need here.
	Texture tex_id1;

    /**
     * constructor
     */
    public textureParams()
    {
    }

    /**
     * This function loads texture data to the GPU.
     *
     * You will need to write this function, and maintain all of the values
     * needed to be sent to the various shaders.
     *
     * @param gl3 - GL3 object on which all OpenGL calls are to be made
     *
     */
    public void loadTexture( GL3 gl3 )
    {
        // Add your code here.
    	//Referred from lecture notes
    	try{
    		InputStream stream1 = new FileInputStream ("smiley2.png");
    		tex_id1 = TextureIO.newTexture(stream1, false, "png");
    	}
    	catch ( IOException exc){
    		exc.printStackTrace();
    		System.exit(1);
    	}
    }

    /**
     * This function sets up the parameters for texture use.
     *
     * You will need to write this function, and maintain all of the values
     * needed to be sent to the various shaders.
     *
     * @param program - The ID of an OpenGL (GLSL) program to which
     *    parameter values are to be sent
     *
     * @param gl3 - GL3 object on which all OpenGL calls are to be made
     *
     */
    public void setUpTexture( int program, GL3 gl3 )
    {
    	gl3.glUniform1i(gl3.glGetUniformLocation(program, "text1"), 0);
    }
}