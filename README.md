# **Chosen programming language : Crystal**
To run my project on Windows :
1. Install crimson for the version manager
   - Open Windows PowerShell and run the following command : 
     ``Invoke-WebRequest "https://github.com/crimson-crystal/crimson/releases/download/1.0.1/crimson-1.0.1-windows-x86_64-msvc.zip" -OutFile crimson.zip`` 
     ``Expand-Archive .\crimson.zip .``
2. Set up the crimson environment with the following command : ``crimson setup``
4. Install the Crystal latest version : ``crimson install`` or specify the version ``crimson install <version>``
5. Set your environment Windows variable for crystal to be available on your command line interpreter
6. Launch your CLI and navigate to the project
7. Execute the file by the command ```crystal guess_the_number_game.cr```

###**Crimson GitHub link : https://github.com/crimson-crystal/crimson**
###**Crystal documentation link : https://crystal-lang.org/reference/1.14/syntax_and_semantics/index.html**