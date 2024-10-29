package com.mycompany.progpoepart2;

import javax.swing.JOptionPane;

public class CreateAccount0 {

    public static void main(String[] args) {
        Login loginclass = new Login();
        int options = Integer.parseInt(JOptionPane.showInputDialog("1.Register\n2.Login\n3.Quit"));

        switch (options) {
            case 1:
                int loginRegister = Integer.parseInt(JOptionPane.showInputDialog(null, "1.Register \n 2.Login \n 3.QUIT \n" + "\n" + "\n" + "Choose \n"));
                if (loginRegister == 1) {
                    String firstName = JOptionPane.showInputDialog(null, "Enter your First Name:");
                    String lastName = JOptionPane.showInputDialog(null, "Enter your Last Name:");
                    String username = JOptionPane.showInputDialog(null, "Enter your username:");
                    String password = JOptionPane.showInputDialog(null, "Enter your password:");

                    loginclass.setFirstname(firstName);
                    loginclass.setLastname(lastName);
                    loginclass.setUsername(username);
                    loginclass.checkUsername();
                    loginclass.setPassword(password);
                    loginclass.checkPasswordComplexity();

                    JOptionPane.showMessageDialog(null, loginclass.registerUser());
                }
                break;

            case 2:
                int loginNot = JOptionPane.showConfirmDialog(null, "Do you want to login?", "Login?", JOptionPane.YES_NO_OPTION);
                if (loginNot == JOptionPane.YES_OPTION) {
                    String username = JOptionPane.showInputDialog(null, "Enter your username:");
                    String password = JOptionPane.showInputDialog(null, "Enter your password:");

                    if (loginclass.loginUser(username, password)) {
                        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
                    }
                    JOptionPane.showMessageDialog(null, loginclass.returnLoginStatus(username, password));
                }
                break;

            case 3:
                System.exit(0);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Invalid option! Please try again.");
                return; // Exit main if invalid option
        }

        int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose one feature: \n1. Add Task: \n2. Show report: \n3. Quit:"));
        Task task = new Task();

        while (menu != 3) {
            switch (menu) {
                case 1:
                    int numTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks do you want to add?"));
                    for (int i = 0; i < numTasks; ++i) {
                        String taskName = JOptionPane.showInputDialog(null, "Please enter name of task:");
                        String taskDescription = JOptionPane.showInputDialog(null, "Please enter description of task:");
                        JOptionPane.showMessageDialog(null, task.checkTaskDescription(taskDescription));
                        String developerDetails = JOptionPane.showInputDialog(null, "Please enter First developer's name and Last name:");
                        int taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter task duration (in hours):"));
                        task.returnTotalHours(numTasks, taskDuration);

                        int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Select one task status:\n1. To Do\n2. Doing\n3. Done"));
                        switch (option) {
                            case 1:
                                task.setTaskStatus("To Do");
                                break;
                            case 2:
                                task.setTaskStatus("Doing");
                                break;
                            case 3:
                                task.setTaskStatus("Done");
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "Incorrect Input!");
                                continue; // Skip to the next iteration if input is incorrect
                        }

                        task.setTaskName(taskName);
                        task.setTaskDescription(taskDescription);
                        task.setTaskNumber(i);
                        task.setDeveloperDetails(developerDetails);
                        task.setTaskDuration(taskDuration);
                        final String taskID = task.createTaskID(taskName, i, developerDetails);
                        JOptionPane.showMessageDialog(null, task.printTaskDetails(taskID));
                    }
                    task.display();
                    break;

                case 2:
                    JOptionPane.showMessageDialog(null, "Coming soon!");
                    break;

                case 3:
                    System.exit(0);
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Invalid option! Please try again.");
                    break;
            }

            menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Choose one feature: \n1. Add Tasks\n2. Show report\n3. Quit:"));
        }
    }
}
