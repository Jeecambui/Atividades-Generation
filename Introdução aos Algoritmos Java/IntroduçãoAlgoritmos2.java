����   < M  "Generation/IntroduçãoAlgoritmos2  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this $LGeneration/IntroduçãoAlgoritmos2; main ([Ljava/lang/String;)V  java/util/Scanner	    java/lang/System   in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	     out Ljava/io/PrintStream;   
Digite o total de dias: 
 " $ # java/io/PrintStream % & println (Ljava/lang/String;)V
  ( ) * nextInt ()I , java/lang/StringBuilder . 
Voce viveu: 
 + 0  &
 + 2 3 4 append (I)Ljava/lang/StringBuilder; 6  anos, 
 + 8 3 9 -(Ljava/lang/String;)Ljava/lang/StringBuilder; ;  mes e  =  dia de vida!!!
 + ? @ A toString ()Ljava/lang/String; args [Ljava/lang/String; ano I mes dia total ler Ljava/util/Scanner; 
SourceFile IntroduçãoAlgoritmos2.java !               /     *� �    
                    	       �     d� Y� � :� � !� '6ml<mpl=mpp>� � +Y-� /� 15� 7� 1:� 7� 1<� 7� >� !�    
   "    
       "  ,  6  c     >    d B C   " B D E  , 8 F E  6 . G E   I H E   X I J   K    L