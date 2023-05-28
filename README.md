Oliver Stojanov 215029

![image](https://github.com/OliverStojanov/SI_2023_lab2_215029/assets/111901069/ca8d5e1b-14d4-4dab-98da-635b3568c0e2)

3)
39 - 30 + 2 = 11
39 e brojot na rebra - 30 brojot na teminja + 2 = 11 e ciklomatska kompleksnost

4)
user = null  allUsers 	=> so ovoj test slusaj pominuvame niz throw
user(null,aushd,asbasb@hah.com) allUsers.add(user(petar,aushd,asbasb@hah.com))
user(pavle,abv123456@,pavle@hah.com) allUsers.add(user(petar,12341234,asbasb@hah.com))	
user(pavle,abv12  3456@ ,pavlehah.com)  allUsers.add(user(petar,12341234,asbasb@hah.com))
![image](https://github.com/OliverStojanov/SI_2023_lab2_215029/assets/111901069/69b73a86-c23e-4285-914b-88c150863c63)

5)
T || T || T       => user = null
neT || T || T     => user(Petar, null, null)
neT || T || neT   => user(Petar, null, petar@gmail.com)
neT || neT || T   => user(Petar, abv123@, null)
neT || neT || neT => user(Petar, abv123@, petar@gmail.com)
