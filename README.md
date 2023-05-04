This is IP Address Finder Tool Using Java Swing.
In this project,I have use Java Swing( JFrame,JButton,TextField,JTextArea,JOptionPane),Java awt Event,Java networking.

Let us discuss some terminologies regarding to this program , URL: URL is an acronym for Uniform Resource Locator. It points to a resource on the World Wide Web. The user have to Enter URL to find IP address in this program. Example of URL: www.linkedin.com , www.youtube.com etc.

 Java Networking: Java ‘ InetAddress class ‘ represents an IP address. The java.net.InetAddress class provides methods to get the IP of any host name. Additionally, ‘InetAddress’ has a cache mechanism to store successful and unsuccessful host name resolutions. Host examples: www.linkedin.com , www.youtube.com , etc. to find the IP address Main statements in this Program // InetAddress get the IP of the Host or server InetAddress iname = InetAddress.getByName(url); //getHostAddress returns the instance of InetAddress containing IP address and Name of the Host String ipadd = iname.getHostAddress();

Java awt Event and java swing: Here I apply awt Event class to action on methods like clicking on button showing popup Message Dialog IP address. Different class for different kind of work all are import from predefined packages. In this program, I used “JFrame, JLabel, JButton,JOtionPane and JTextField”. I create text Field, frame, label and button using java swing classes and color class of java swing. In addition, set their size, color, width and height by using their methods.To make the button active I have use Action Listener interface which is functional interface and implements its actionPerformed() method.

GUI of IP Finder:

![UI](https://user-images.githubusercontent.com/71519458/236199329-55cea522-d716-4aeb-b930-1f0c0475389d.png)

Working:

Example1:

![Example1](https://user-images.githubusercontent.com/71519458/236199539-d541241a-0289-4a7e-bc2a-acb0125e0779.png)

Output1:

![Ans1](https://user-images.githubusercontent.com/71519458/236199606-f1c6a31f-8fcb-4583-bc2f-cbc7c5e9f90c.png)

Example2:

![Example2](https://user-images.githubusercontent.com/71519458/236199728-8387f632-c87e-46bb-8ab8-460e80a8ca60.png)


Output2:

![Ans2](https://user-images.githubusercontent.com/71519458/236199799-0cec7b92-cd5c-41b2-a500-b10810a75fc8.png)


Example3:

![Example3](https://user-images.githubusercontent.com/71519458/236199945-f7fe0325-40ee-43d4-b3e4-fbf1a7d58ae0.png)

Output3:

![Ans3](https://user-images.githubusercontent.com/71519458/236199983-0d434eb7-78ff-42d8-a111-f0759451db1f.png)
