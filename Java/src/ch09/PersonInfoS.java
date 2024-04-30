package ch09;
import java.io.*;
public class PersonInfoS {
//	public class PersonalInfoProtectionSystem {

	    public static void main(String[] args) {
	        try {
	            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	            System.out.println("请输入您的姓名：");
	            String name = reader.readLine();
	            System.out.println("请输入您的联系方式：");
	            String contact = reader.readLine();

	            String encryptedName = encryptName(name);
	            String hiddenContact = hideContact(contact);

	            FileWriter writer = new FileWriter("personal_info.txt");
	            writer.write("加密后的姓名：" + encryptedName + "\n");
	            writer.write("部分隐藏的联系方式：" + hiddenContact);
	            writer.close();

	            System.out.println("个人信息已处理完成并保存到文件中。");
	        } catch (IOException e) {
	            System.out.println("操作失败：" + e.getMessage());
	        }
	    }

	    private static String encryptName(String name) {
	        // 简化为对姓名做简单的逆向处理作为加密示例
	        return new StringBuilder(name).reverse().toString();
	    }

	    private static String hideContact(String contact) {
	        // 简化为隐藏联系方式的后四位数字作为隐私保护示例
	        if (contact.length() <= 4) {
	            return "****" + contact;
	        } else {
	            return "****" + contact.substring(contact.length() - 4);
	        }
	    }
	}

