Một lần làm xong dự án thì thấy tự dưng phía khách hàng thuê hẳn một "cao nhân" không biết từ đâu về viết lại code cho cả dự án.Kỳ lạ là tên này không hề hiểu nghiệp vụ dự án, cũng chưa từng làm với framework của dự án nhưng vẫn viết lại đống code của dự án ầm ầm.Hỏi ra mới biết là làm refactoring code, vậy code refactoring là gì, làm xong có lợi ích gì và làm như thế nào?  

## Refactoring (Tái cấu trúc) là gì?  
Refactoring là quá trình cải thiện code hiện có mà không thay đổi chức năng của nó. Là nhà phát triển phần mềm, chúng ta thường xuyên phải đối mặt với nhu cầu cải tiến và tới ưu hóa code của mình. Cho dù đó là về hiệu suất, khả năng đọc hiểu code hay bảo trì code, refactoring code là một kỹ năng cần thiết.  

## các phương pháp để refactoring code  
### 1. Xác định khu vực có vấn đề  
Bước đầu tiên là xác định các phần code cần được cải thiện. Đó có thể là bất cứ thứ gì từ cách đặt tên biến kém dẫn đến toàn bộ đoạn code khó hiểu  

### 2. Lên kế hoạch
Khi bạn đã xác định được những nơi có vấn đề, bạn cần lập kế hoạch để khác phục chúng. Kế hoặc này sẽ khác nhau đối với mọi tình huống, nhưng điều quan trọng là bạn phải có ý tưởng rõ ràng về những gì bạn muốn làm trước khi bắt đầu thực hiện thay đổi  

### 3. Hãy thay đổi từ những thứ nhỏ nhất và giữ chúng  
Khi refactoring code, điều quan trọng là phải bắt đầu từ những thay đổi nhỏ trước, rồi mới tăng dần lên. Điều này sẽ giúp đảm bảo rằng code của bạn ổn định hơn và bạn có thể dễ dàng hoàn tác lại các thay đổi của mình nếu cần

### 4. Viết test
hãy hi vọng code của bạn đã được kiểm tra sau khi refactoring xong. Nếu không phải thì bây giờ là lúc để thay đổi điều đó. Các bài test tốt sẽ giúp bạn rất nhiều trong quá trình refactoring và đảm bảo rằng bạn sẽ không phá hỏng ứng dụng (Hoặc biến ứng dụng từ lợn lành thành lợn què). Thông thường, người ta sẽ tạo ra môi trường an toàn để test, giúp bạn tập trung vào mục tiêu refactoring code của mình.  

### 5. Refactoring dần dần  
Đừng cố gằng refactoring tất cả các đoạn code của mình cùng một lúc. Refactoring từng bước, thực hiện các thay đổi nhỏ, thử nghiệm lại khi bạn thực hiện.  

### 6. Sử dụng công cụ refactoring  
Có một số công cụ refactoring khác nhau có sẵn. Những công cụ này có thể giúp tự động hóa một số quy trình refactoring và có thể giúp bạn hoàn tác lại các thay đổi nếu cấn thiết dễ dàng hơn.  

### 7 Ghi lại các thay đổi của bạn 
Khi bạn hoàn tất refactoring , hãy nhớ ghi lại các thay đổi của bạn. Điều này sẽ giúp người khác hiểu được tại sao code cũ được thay đổi và cấu trúc mới là gì.  

### 8. Sử dụng hệ thống kiểm soát mã nguồn (Source Control System)  
Khi bạn refactoring lại code, điều quan trọng là sử dụng hệ thống kiểm soát mã nguồn để bạn có thể dễ dàng hoàn tác về phiên bản trước nếu có sự cố. Điều này có thể giúp bạn tiết kiệm rất nhiều thời gian trong trường hợp bạn mắc lỗi  

### 9. Thực hiện kiểm tra hồi quy  
Sau khi đã refactoring lại code của mình, bạn nên thực hiện kiểm tra hồi quy. Điề này sẽ giúp đảm bảo rằng các thay đổi của bạn không tạo ra bất kỳ lõi mới nào.  

### 10. Hãy chuẩn bị để hoàn tác các thay đổi  
Không phải mọi lần refactoring đều sẽ thành công. hãy chuẩn bị để hoàn tác các thay đổi nếu cần thiết.  

