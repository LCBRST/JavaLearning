package ch09;
import java.io.*;
public class InformationVS {
//public class InformationVerificationSystem {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("请输入新闻内容：");
            String news = reader.readLine();

            boolean isRealNews = verifyNews(news);

            FileWriter writer = new FileWriter("verification_result.txt");
            if (isRealNews) {
                writer.write("这是一条真实的新闻。");
            } else {
                writer.write("这可能是一条虚假新闻，请谨慎传播。");
            }
            writer.close();

            System.out.println("验证结果已保存到文件中。");
        } catch (IOException e) {
            System.out.println("操作失败：" + e.getMessage());
        }
    }

    private static boolean verifyNews(String news) {
        // 在这里可以添加验证逻辑，这里简化为判断是否包含关键词"谣言"
        return !news.toLowerCase().contains("谣言");
    }
}
