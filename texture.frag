#version 150

// Texture mapping fragment shader
//
// Contributor:  VAIBHAVI AWGHATE

// INCOMING DATA

// Add all variables containing data used by the
// fragment shader for lighting and texture mapping

in vec2 texCoord;

uniform sampler2D text1;

// OUTGOING DATA

// final fragment color
out vec4 fragmentColor;

void main()
{
    // Replace with proper texture mapping code
    fragmentColor = vec4( 1.0, 1.0, 1.0, 1.0 );
    //condition for mapping on front quad 
    fragmentColor = texture2D(text1, texCoord);
}
