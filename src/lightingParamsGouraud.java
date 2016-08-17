//
// lightingParams.java
//
// Created by Joe Geigel on 1/23/13.
//
// Contributor:  VAIBHAVI AWGHATE
//
// 20155 version
//

import javax.media.opengl.*;
import javax.media.opengl.fixedfunc.*;

public class lightingParamsGouraud
{
    // Add any data members you need here.
	//Material properties of the teapot 
	float ambient_color[] = { (float) 0.5, (float) 0.1, (float) 0.9, (float) 1.0};
	float diffuse_color[] = { (float) 0.89, 0, 0, 1};
	float specular_color[] = { 1, 1, 1, 1};
	
	//Reflective characteristics of the teapot and quad
	float ka = (float) 0.5;
	float kd = ( float) 0.7;
	float ks = (float)1.0;
	float specular_exponent = (float) 10.0;
	
	//Properties of the light source
	float source_color[] = { 1, 1, 0, 1};
	float source_position[] = { 0, 5, 2, 1};
	
	//Ambient light in the scene
	float color[] = {(float) 0.5, (float) 0.5, (float) 0.5, 1};

    /**
     * constructor
     */
    public lightingParamsGouraud()
    {
    }

    /**
     * This function sets up the lighting, material, and shading parameters
     * for the Phong shader.
     *
     * You will need to write this function, and maintain all of the values
     * needed to be sent to the vertex shader.
     *
     * @param program - The ID of an OpenGL (GLSL) shader program to which
     *    parameter values are to be sent
     *
     * @param gl3 - GL3 object on which all OpenGL calls are to be made
     *
     */
    public void setUpGouraud (int program, GL3 gl3)
    {
        // Add your code here.
    	
    	//All values are being sent to the vertex shader
    	gl3.glUniform4fv(gl3.glGetUniformLocation(program, "ambientColor"), 1, ambient_color, 0);
    	gl3.glUniform4fv(gl3.glGetUniformLocation(program, "diffuseColor"), 1, diffuse_color, 0);
    	gl3.glUniform4fv(gl3.glGetUniformLocation(program, "specularColor"), 1, specular_color, 0);
    	gl3.glUniform4fv(gl3.glGetUniformLocation(program, "sourceColor"), 1, source_color, 0);
    	gl3.glUniform4fv(gl3.glGetUniformLocation(program, "sourcePosition"), 1, source_position, 0);
    	gl3.glUniform4fv(gl3.glGetUniformLocation(program, "ambientLightColor"), 1, color, 0);
    	gl3.glUniform1f(gl3.glGetUniformLocation(program, "ambientCoefficient"),ka);
    	gl3.glUniform1f(gl3.glGetUniformLocation(program, "diffuseCoefficient"),kd);
    	gl3.glUniform1f(gl3.glGetUniformLocation(program, "specularCoefficient"),ks);
    	gl3.glUniform1f(gl3.glGetUniformLocation(program, "specularExponent"),specular_exponent);
    }
}
