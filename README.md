# Spring Scheduler Reminder Job
This repository contains a Spring Boot application that uses the Spring Scheduler to execute reminder tasks at specific times. Few reminder tasks are defined in the ReminderJob class: 

* Running at 12 PM every day
* Running at 10:15 AM every day
* Running at 10:30 AM every day

> The specific times at which these tasks are executed can be customized by changing the values in the application.properties file.

## Getting Started
To get started with this application, follow these steps:

* Clone the repository to your local machine.
* Open the project in your preferred IDE.
* Make any necessary changes to the application.properties file to customize the task execution times.
* Run the application.



## Dependencies
> This application has the following dependencies:

* Spring Boot Starter Web
* Spring Boot Starter Test
* Spring Boot Starter Validation

> These dependencies are defined in the pom.xml file.

## Configuration
> The application.properties file contains the following crone expressions that define the times at which the reminder tasks are executed:

* noon.time=0 0 12 * * ?
* morningten15.time=0 15 10 ? * *
* morningten30.time=0 30 10 ? * *

> For more information on crone expressions, see [this](https://docs.oracle.com/cd/E12058_01/doc/doc.1014/e12030/cron_expressions.htm) article.


## Contributing
> If you'd like to contribute to this project, please fork the repository and submit a pull request. Contributions are always welcome!

