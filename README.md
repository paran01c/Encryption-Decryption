A encryption and decryption machine

the comand line argument will tell the program how to behave
default means in case that command line argument misses
the order of the comand line argument does not matter

  -mode tells the program if should encrypt or encrypt the mesage (default enc)
        enc encrypt the message
        dec decrypt the message
        
  -key tells the program the key it should use (default 0)
        key INT number used by the alg
        
  -out where to output the messsage (default the standard output)
        out the file that will be created with the message 
        
  -alg will chose the algorithm to be applied to the program (default shift)
        shift alg will shift only the letters by key ammount
        unicode willmove all characters by key ammount
  
  the message will be taken either from a file or from the command line argument
  -data the message will be taken from the command line argument (default empty string)
        data the mesaage to be dercypted
        
  -in specifies the file from where the message will be taken (default empty string)
  if both -data and -in are present it will take it from -data
  
  -mode "encryption mode" -in "file name of input message" -out "filename of output message" -key "number" -alg "the desired algorithm"
  -data "the message" -
  

  
