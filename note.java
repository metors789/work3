package notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class note {
		static ArrayList<String> Title_list = new ArrayList<>();
		static ArrayList<String> Content_list = new ArrayList<>(); 
		static ArrayList<String> Status_list = new ArrayList<>();
	public static void main(String[] args) {
		while(true) {
			System.out.println("����1��ӣ�����2ɾ��������3�ı�״̬������4��ѯ�����������˳�");
			int number = InputInt();
			if(number==1) {	
				if(Add()) System.out.println("��ӳɹ�");
			}
			else if (number==2) {
				int index1 = InputInt();
				if(Delete(index1)) System.out.println("ɾ���ɹ�");
				else {
					System.out.println("ɾ��ʧ��");
				}
			}
			else if(number==3) {
				System.out.println("������Ҫɾ�����������ţ�");
				int index2 = InputInt();
				if(Change_status(index2)) System.out.println("�ı�״̬");
				else {
					System.out.println("�ı�״̬ʧ��");
				}
			}
			else if (number==4) {
				printf_list();
			}
			else {
				System.out.println("������");
				break;
			}
		}
	}

	public static String InputString() {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		return s;
	}
	
	public static int InputInt() {
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		return x;
	}
	
	public static boolean Delete(int index) {
		if (index<=Title_list.size()) {
			Title_list.remove(index-1);
			Content_list.remove(index-1);
			Status_list.remove(index-1);
			return true;
		}
		else {
			return false;
		}	
	}
	
	public static boolean Add() {
		String string1 = InputString();
		Title_list.add(string1);
		String string2 = InputString();
		Content_list.add(string2);
		Status_list.add("δ���");
		return true;
	}
	
    public static boolean Change_status(int index) {
    	if (index<=Title_list.size()) {
			Status_list.set(index-1,"�����");
			return true;
		}
    	else {
			return false;
		}
    	
	}
    public static boolean printf_list() {
    	int i;
		
    	for(i=0;i<Title_list.size();i++) {
			System.out.println("���⣺ "+Title_list.get(i));
			System.out.println("���ݣ� "+Content_list.get(i));
			System.out.println("���ԣ� "+Status_list.get(i));
		}
    	return true;
	}
}