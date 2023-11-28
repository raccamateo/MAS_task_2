# MAS_task_2

# Multi-Agent System for Treasure Hunting

## Project Overview
This JADE-based multi-agent system is designed for a simulated treasure hunt scenario within the Dedale environment. It features Explorer agents for mapping the environment and Collector agents for gathering treasures.

## Prerequisites
- Java JDK 1.8 or above
- Maven

## Setup and Installation
Clone this repository and navigate to the project directory:
git clone <https://github.com/raccamateo/MAS_task_2/>
cd <jade>


Build the project using Maven:
mvn clean compile


## Running the Agents
Start the JADE-based system using the following command:
java -cp lib/jade.jar:classes eu.su.mas.dedaleEtu.mas.agents.dummies.MainContaine

Replace `lib/jade.jar:classes` with the actual paths to your JADE jar and compiled classes.

## System Architecture
- **ExplorerAgent**: Responsible for exploring and mapping the environment.
- **CollectorAgent**: Focused on locating and collecting treasures.

## Testing
Run automated unit tests for the agents:
mvn test


## Contributing
Contributions are welcome. Please fork the repository and submit pull requests for any enhancements.

## Authors
- [Mateo W. Racca]

## License
This project is licensed under the MIT license.

https://github.com/raccamateo/MAS_task_2
