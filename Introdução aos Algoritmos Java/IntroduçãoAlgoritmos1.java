����   < R  "Generation/IntroduçãoAlgoritmos1  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this $LGeneration/IntroduçãoAlgoritmos1; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   
Digite os anos: 
 " $ # java/io/PrintStream % & print (Ljava/lang/String;)V ( Digite os anos: 
 " * + & println
  - . / nextInt ()I 1 Digite os meses:  3 Digite os dias:  5 java/lang/StringBuilder 7 
Idade total em dias: 
 4 9  &
 4 ; < = append (I)Ljava/lang/StringBuilder; ? 

 4 A < B -(Ljava/lang/String;)Ljava/lang/StringBuilder;
 4 D E F toString ()Ljava/lang/String; args [Ljava/lang/String; ano I mes dia total ler Ljava/util/Scanner; 
SourceFile IntroduçãoAlgoritmos1.java !               /     *� �    
                    	       �     i� Y� � :� � !� '� )� ,<� 0� )� ,=� 2� )� ,>mhh``6� � 4Y6� 8� :>� @� C� )�    
   .    
       "  *  0  8  >  L  h     >    i G H   " G I J  0 9 K J  > + L J  L  M J   ] N O   P    Q