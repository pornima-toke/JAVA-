// Write a function to find the reverse of a number.

import java.util.*;
public class RevNumber
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		int rev = revNo(n);
		System.out.println("Reverse Numuber"+rev);
	}
	public static int revNo(int n)
	{
		int rev = 0;
		while(n > 0)
		{
			rev = rev * 10 + n % 10;
			n = n / 10;
		}
		return rev;
	}
}
		
		* {
    margin: 0;
    padding: 0;
    box-sizing: border-box;
    font-family: Arial, sans-serif;
}

body {
    line-height: 1.6;
}

/* Header */
.header {
    display: flex;
    justify-content: space-between;
    padding: 20px;
}

/* Hero */
.hero {
    display: flex;
    padding: 50px;
    align-items: center;
}

.hero-text {
    flex: 1;
}

.hero-text h1 {
    font-size: 36px;
}

.hero-text button {
    padding: 10px 20px;
    margin-top: 20px;
}

.hero-img {
    flex: 1;
}

.hero-img img {
    width: 100%;
}

/* Features */
.features {
    display: flex;
}

.feature {
    flex: 1;
    padding: 30px;
    color: white;
}

.dark { background: #000; }
.cyan { background: #00c6c6; }
.light { background: #2dd4bf; }

/* About */
.about {
    text-align: center;
    padding: 50px;
}

/* Split Section */
.split {
    display: flex;
}

.split-img, .split-text {
    flex: 1;
}

.split-img img {
    width: 100%;
}

.split-text {
    background: #00c6c6;
    color: white;
    padding: 40px;
}

/* Services */
.services {
    text-align: center;
    padding: 50px;
}

.service-box {
    display: flex;
    flex-wrap: wrap;
    justify-content: center;
}

.service {
    width: 30%;
    margin: 10px;
    padding: 20px;
    border: 1px solid #ccc;
}

/* CTA */
.cta {
    background: #00c6c6;
    color: white;
    text-align: center;
    padding: 40px;
}

/* Footer */
.footer {
    background: black;
    color: white;
    text-align: center;
    padding: 20px;
}
