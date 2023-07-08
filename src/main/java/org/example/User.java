package org.example;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        // AS-IS
        // 이 상태 만으로는 몇 자리의 비밀번호를 생성할 지 컨트롤 할 수 없다.
        // RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
        // String randomPassword = randomPasswordGenerator.generatorPassword();

        // TO-BE
        String password = passwordGenerator.generatePassword();
        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if(password.length() >= 8 && password.length() <= 12) {
            this.password = password;
        }
    }

    public String getPassword() {
        return password;
    }
}
