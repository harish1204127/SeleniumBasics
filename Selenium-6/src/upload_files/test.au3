$windowHandle= WinGetHandle("File Upload")
WinActivate($windowHandle)
ControlSetText("File Upload","","[CLASS:Edit;INSTANCE:1]","F:\Selenium\Screen1.png")
ControlClick("File Upload","", "[CLASS:Button;INSTANCE:1]")