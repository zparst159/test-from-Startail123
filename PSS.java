import java.io.*;
import java.util.Scanner;
import java.util.Random;

public class PSS {
public static void main(String args[]) 
{
	int com_rnd;
	int player;
	int com_win=0;
	int player_win=0;
	int F_count=18;
	int Win_buffer;
	Scanner scanner = new Scanner(System.in);
	while(true)
	{
		for(int i = 0 ; i<F_count;i++)
		{
			System.out.print(" ");
			
		}
	System.out.println("F");
	System.out.println("| -3 | -2 | -1 |  0 |  1 |  2 |  3 |");
	System.out.print("��J�ŤM���Y��(�Ʀr): �ŤM(1) ��(2) ���Y(3) ");
	player = scanner.nextInt();
	com_rnd = (int)(Math.random()*3)+1;
	switch(com_rnd)
	{
		case 1:
		System.out.println("�q��:�ŤM");
		break;
		case 2:
		System.out.println("�q��:��");
		break;
		case 3:
		System.out.println("�q��:���Y");
		break;
	}
	
	switch(intwhoWin(com_rnd,player))
	{
		case -1:
		{
			F_count-=5;
			com_win+=1;
			System.out.println("------�A��F------");
		}
		break;
		case 0:
		{
			System.out.println("------����------");
		}
		break;
		case 1:
		{
			F_count +=5;
			player_win+=1;
			System.out.println("------�AĹ�F------");
		}
	}
	if(com_win==4)
	{
		break;
	}
	else if(player_win == 4)
	{
		break;
	}
	
	}
	for(int i = 0 ; i<F_count;i++)
		{
			System.out.print(" ");
			
		}
	System.out.println("F");
	System.out.println("| -3 | -2 | -1 |  0 |  1 |  2 |  3 |");
}

static public int intwhoWin(int com ,int player)
{
	//-1�� 0���� 1Ĺ
	switch(player)
	{
		case 1: //�ŤM
		if(com == 1)
		{
			return 0;
		}
		else if(com == 2)
		{
			return 1;
		}
		else
		{
			return -1;
		}
		case 2: //��
		if(com == 1)
		{
			return -1;
		}
		else if(com == 2)
		{
			return 0;
		}
		else
		{
			return 1;
		}
		case 3: //���Y
		if(com == 1)
		{
			return 1;
		}
		else if(com == 2)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
	return 0;
}


}