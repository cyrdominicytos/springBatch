package fr.learn.open.springbatchimportcsv;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBatchImportCsvApplication {

    public static void main(String[] args) {
        System.exit(
                SpringApplication.exit(
                        SpringApplication.run(SpringBatchImportCsvApplication.class, args)
                )
        );

    }

}
