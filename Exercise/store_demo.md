Viết chương trình quản lý sản phẩm của một của hàng đồ điện tử. 
Khi chương trình bắt đầu chạy sẽ hiện menu cho phép đăng nhập hoặc quên mật khẩu  
Để có thể quản lý thông tin các sản phẩm và thông tin cá nhân thì cần phải đăng nhập

## Đăng nhập 
Để đăng nhập vào hệ thống cần sử dụng email và password. Tài khoản này đã được cấp.  
Thông tin về tài khoản sẽ bao gồm: id (mã tự sinh gồm 5 ký tự), fullName, email (unique), mobile (unique), password, createAt  
- Nếu đăng nhập thành công hiện dòng chữ "Xin chào + fullName"  

- Đăng nhập không thành công hiện menu cho phép đăng nhập hoặc quên mật khẩu

## Quên mật khẩu  
Trong trường hợp lựa chọn quên mật khẩu, cần phải nhập email. 
- Nếu email đã được sử dụng để đăng ký tài khoản thì cho phép nhập mật khẩu mới 
- Nếu email chưa được sử dụng để đăng ký tài khoản thì thông báo "Email chưa được đăng ký tài khoản" và quay về menu ban đầu.  

## Đăng nhập thành công  
Sau khi đăng nhập thành công hiện menu cho phép người dùng thực hiện các công việc:  

1. Xem danh sách sản phẩm
2. Tìm sản phẩm theo id
3. Thêm sản phẩm mới 
4. Quản lý thông tin cá nhân 
5. Đăng xuất 
0. Thoát chương trình  

### Tìm sản phẩm theo id  
Khi tìm sản phẩm theo id, nếu tìm được sản phẩm thì cho phép cập nhật thông tin sản phẩm hoặc xóa sản phẩm đó ra khỏi danh sách

### Quản lý thông tin cá nhân 
Cho phép người dùng được cập nhật các thông tin như fullname, email, mobile, password
