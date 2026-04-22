Practical 13 - Multi-Package Access Specifier Demo
===================================================
Run all commands from inside the Practical13_Packages/ folder:

  javac apack/A.java
  javac -cp . bpack/B.java
  javac -cp . cpack/C.java
  javac -cp . dpack/ProtectedDemo.java
  java -cp . dpack.ProtectedDemo
