package com.longlong.maker.generator.file;

import com.longlong.maker.model.DataModel;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.IOException;

/**
 * 核心生成器
 */
public class FileGenerator {

    /**
     * 生成
     * 
     * @param model 数据模型
     * @throws TemplateException
     * @throws IOException
     */
    public static void doGenerate(Object model) throws TemplateException, IOException {
        String projectPath = System.getProperty("user.dir");
        // 整个项目的根路径
        File parentFile = new File(projectPath);
        // 输入路径
        String inputPath = new File(parentFile, "along-generator-demo-projects/acm-template").getAbsolutePath();
        // 输出路径
        String outputPath = projectPath;
        // 生成静态文件
        System.out.println("静态文件");
        System.out.println("输入路径：" + inputPath);
        System.out.println("输出路径：" + outputPath);
        StaticGenerator.copyFilesByHutool(inputPath, outputPath);
        // 生成动态文件
        String inputDynamicFilePath = projectPath + File.separator+ "along-generator-maker" + File.separator + "src/main/resources/templates/MainTemplate.java.ftl";
        String outputDynamicFilePath = outputPath + File.separator + "acm-template/src/com/longlong/acm/MainTemplate.java";
        System.out.println("动态文件");
        System.out.println("输入路径：" + inputDynamicFilePath);
        System.out.println("输出路径：" + outputDynamicFilePath);
        DynamicFileGenerator.doGenerate(inputDynamicFilePath, outputDynamicFilePath, model);
    }

    public static void main(String[] args) throws TemplateException, IOException {
        DataModel dataModel = new DataModel();
        dataModel.setAuthor("longlong");
        dataModel.setLoop(true);
        dataModel.setOutputText("求和结果123");
        doGenerate(dataModel);
    }
}

