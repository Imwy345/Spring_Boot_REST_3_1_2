package web.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "users")
public class User {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column(name = "name")
        private String name;

        @Column(name = "surname")
        private String surname;

        @Column(name = "age")
        private byte age;

        @Column(name = "email")
        private String email;

        public User() {
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getSurname() {
                return surname;
        }

        public void setSurname(String surname) {
                this.surname = surname;
        }

        public byte getAge() {
                return age;
        }

        public void setAge(byte age) {
                this.age = age;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                User user = (User) o;
                return age == user.age && Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(surname, user.surname) && Objects.equals(email, user.email);
        }

        @Override
        public int hashCode() {
                return Objects.hash(id, name, surname, age, email);
        }

        @Override
        public String toString() {
                return "User{" +
                        "  id=" + id +
                        ", name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", age=" + age +
                        ", email='" + email + '\'' +
                        '}';
        }
}
