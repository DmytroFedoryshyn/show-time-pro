# ShowTimePro
This is a simple web application for managing a cinema. <br>
It allows users to perform a list of different operations
with cinema halls, movies, movie sessions, orders, shopping carts, 
tickets, users like:
<ul>
<li>Registration as a user or admin</li>
<li>Add a new cinema hall</li>
<li>Get all cinema halls</li>
<li>Add a movie</li>
<li>Get all movies</li>
<li>Add a movie session</li>
<li>Get available movie sessions</li>
<li>Update a movie session</li>
<li>Delete a movie session</li>
<li>Complete an order</li>
<li>Get order history</li>
<li>Get a shopping cart by user</li>
<li>Get all movie sessions in a shopping cart</li>
<li>Get user by email</li>
</ul>

<h3>Project Structure</h3>
The project consists of multiple packages:
<ul>
<li><i>config</i> - contains all of the necessary configuration for a Spring framework</li>
<li><i>controller</i> - contains REST controllers which create endpoints for the server</li>
<li><i>dao</i> - contains data access objects (DAO's) used for interacting with the DB</li>
<li><i>dto</i> - contains data transfer objects (DTO's) used for exchanging information
with the client</li>
<li><i>exception</i> - contains all of the custom exceptions</li>
<li><i>lib</i> - contains custom validation annotations</li>
<li><i>model</i> - contains all classes of the model layer.</li>
<li><i>service</i> - contains all classes of the service layer.</li>
<li><i>util</i> - contains all utility classes for simplifying some tasks.</li>
</ul>
<h3>Used technologies</h3>
<ul>
    <li>Java 17</li>
    <li>Spring MVC</li>
    <li>Spring Security</li>
    <li>Hibernate</li>
    <li>Tomcat 9</li>
    <li>H2 database</li>
    <li>REST</li>
    <li>JSON</li>
    <li>Jackson</li>
    <li>Maven</li>
</ul>
<h3>How to install and use the project</h3>
<ol>
<li>Firstly, you need to install Java for your computer to be able
to run this program. To download it, please visit 
<a href = "https://www.oracle.com/cis/java/technologies/downloads/">this link</a>.</li>
<li>To run a project, you need an IDE, for example IntelliJ IDEA. 
You can get it <a href="https://www.jetbrains.com/idea/download">here</a>.</li>
<li>To download a project, run git clone at the desired folder.</li>
<li>To open a project, open IntelliJ IDEA, select "Open Project"
and choose the correct path.</li>
<li>Download Tomcat from <a href = "https://tomcat.apache.org/download-80.cgi">here</a>.</li>
<li>To run the project, select "Run" at top panel of IntelliJ IDEA, then - "Edit configurations".</li>
<li>Select path to your Tomcat add artifact - war:exploded and press "Run".</li>
</ol>

    
