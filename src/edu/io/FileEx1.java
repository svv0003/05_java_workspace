package edu.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileEx1 {

    // 예전에는 사용자가 컴퓨터나 핸드폰, 디바이스 기기에
    // 저장한 명칭을 최대한 사용하여 회사 내부 파일에 저장했다.
    public void 고전방식(){

        String originName = "사진.png";

        Path path = Path.of("profiles","member01",originName);
        int dot = originName.lastIndexOf('.'); // . 이 몇번재에 존재하는지 확인
        String baseName = originName.substring(0, dot); // 파일이름 처음부터 .이 존재하기 전까지의 파일 명칭을 가져오는 방법
        String extName = originName.substring(dot); // .확장자 이름을 가지고 있는 상태

        System.out.println("dot . 의 위치 : " + dot);
        System.out.println("baseName : " + baseName);
        System.out.println("extName : " + extName);


        while (Files.exists(path)){
            // 존재하지 않으면 알아서 while 문 종료 ~
            String NewName = baseName + "_" + System.currentTimeMillis() +  extName;
            System.out.println("newName : " + NewName);

            path = Path.of("profiles","member01",NewName);

        }


        try {
            Files.createDirectories(path.getParent());// profile/member01 까지만 포함
            String imgURL = "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcTZWlPjghR3F6rno2RtA56T9mRyUL_BWILiAmpxP0-npm6nmw-Gsm9AFDYLAl8paow4CEKMeRHaQn39tB4VniZan8svg2JIpXXOO6L84F4";
            URL url = new URL(imgURL);
            InputStream in = url.openStream();
            Files.copy(in,path);
            in.close(); // 메모리 누수 방지를 위해서 실시간으로 데이터를 받아오는 stream을 종료
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void 회사에서사진저장하는기능1(String imgUrl) {

        String 회사에서사용하는기본이름 = "회사이름_" + System.currentTimeMillis() + ".jpg";
        Path path = Path.of("profiles","회사이름", 회사에서사용하는기본이름);

        try {
            Files.createDirectories(path.getParent());
            URL url = new URL(imgUrl);
            InputStream in = url.openStream();
            Files.copy(in, path);
            System.out.println("사진 저장 완료");
            in.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void 회사에서사진저장하는기능2(String imgUrl) {

        String 회사에서사용하는기본이름 = "회사이름_" + System.currentTimeMillis() + ".jpg";
        Path path = Path.of("profiles","회사이름", 회사에서사용하는기본이름);

        try {
            Files.createDirectories(path.getParent());
            URL url = new URL(imgUrl);
            // InputStream in = url.openStream();
            //         inputStream에서 가져온 이미지 데이터 위치    회사 컴퓨터에 저장할 위치 + 파일명
            Files.copy(url.openStream(),                            path);
            System.out.println("사진 저장 완료");
            url.openStream().close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /********************************************************
                        InputStream 변천사
     ********************************************************/
    public void defaultInputStream() {

        try {

            Path path = Path.of("폴더위치/파일명.확장자명");
            URL url = new URL("https://www.apple.com/v/iphone-17-pro/a/images/overview/product-viewer/initial__fo4stdzx5uy6_large_2x.jpg");
            InputStream in = url.openStream();

            // 한 번에 가져올 수 있는 최대 공간 크기
            // 최대 1024 byte씩 가져올 수 있다.
            // 1 KB = 1024 Byte
            // 1 MB = 1024 KB (1024^2 Byte)
            byte[] buffer = new byte[1024];
            FileOutputStream outputStream = new FileOutputStream(path.toFile());

            int len;
            // while 사용한 이유
            // 데이터를 1 KB 씩 여러 번 나눠 가져오기 위해서
            while ((len = in.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
            in.close();
            outputStream.close();

        } catch (MalformedURLException e) {
            System.out.println("InputStream에서 데이터를 가져올 수 있도록 문 열어주는 과정에서 발생하는 문제들");
        } catch (IOException e) {
            System.out.println("url 연결로부터 발생 가능한 각종 IO 관련 문제들");
        }

    }

    public void 경로결합() {

        Path dir = Path.of("폴더1/폴더2");

        Path file = dir.resolve("파일명.txt");

        /*
resolve ( )
기본 경로와 새로운 경로, 또는 파일을 결합하는 기능
file에는 폴더1/폴더2/파일명.txt로 결합하여 사용된다.
         */

    }
}
