       identification division.
       program-id.              myprog.       
       environment division.
       configuration section.
       data division.
       WORKING-STORAGE SECTION.  
       01 x pic x value "a".
       01 y pic x value "b".
       01 z pic x.    
       linkage section.
       procedure division using test1 test2 test3. 
           move x to z
       	   .
           GOBACK. 
       end program myprog.