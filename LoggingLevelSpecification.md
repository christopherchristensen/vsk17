# Logging Level

> Error-Levels gemäss RFC. Best Practice of Logging-Levels.
> 
> Gruppenmitglieder:
> 
> * Lukas Arnold
> * Valentin Bürgler
> * Christopher Christensen
> * Melvin Werthmüller

### 0: Emergency: system is unusable
* Crash of system

### 1: Alert: action must be taken immediately
* Not enough space (RAM, Festplatte)

### 2: Critical: critical conditions
* Network connection lost

### 3: Error: error conditions
* Game crashed

### 4: Warning: warning conditions
* Network connection slow
* Almost no space

### 5: Notice: normal but significant condition
* Every information of a wrong click to the user

### 6: Informational: informational messages
* Population only still life
* Stats: still life, spaceships and oscillators
* Every click from the user

### 7: Debug: debug-level messages
* Every step of the game
	* Cell coordinate change of object (x,y)
	* New cell added
	* Cell died due to underpopulation
	* Cell died due to overpopulation
	* Cells reach next generation
