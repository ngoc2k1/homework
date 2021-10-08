**Bốn đặc tính cơ bản của OOP**

|<p>**Tính<br>đóng**</p><p>**gói**</p>|<p>- Các đối tượng khác không thể tác động trực tiếp đến dữ liệu bên trong và thay đổi trạng thái đối tượng, mà cần thông qua các phương thức công khai do đối tượng cung cấp</p><p></p><p>- Che giấu thông tin, tăng tính bảo mật</p><p></p>|Private: bên trong class|
| :-: | :- | :- |
|||<p>Default: bên trong packet</p><p></p>|
|||Protected: bên trong packet or tính kế thừa (extend)|
|||Public: trong project|
|**Tính kế thừa**|<p>-Xây dựng 1 lớp con (mới) kế thừa toàn </p><p>bộ lớp cha (thuộc tính, phương thức)</p><p></p><p>-Lớp con có thể mở rộng thành phần kế thừa (đã có trước đó) hoặc bổ sung thành phần mới (trước chưa có)</p><p></p>||
|**Tính đa hình**|<p>Các đối tượng khác nhau thực thi chức năng giống nhau (cùng method) theo các cách khác nhau</p><p></p>|<p>Overriding (ghi đè) cùng phương thức, cùng tham số (runtime)</p><p></p>|
|||<p>Overloading (nạp chồng) cùng phương thức, khác tham số (type, số lượng, thứ tự) (compile)</p><p></p>|
|**Tính trừu tượng**|Tập trung những cái cốt lõi đối tượng, loại bỏ những thứ không cần thiết|Abtract class|Interface|
|||<p>-hướng đến bản chất của đối tượng</p><p></p><p>-không hỗ trợ đa kế thừa</p><p>trừu tượng hóa 1 phần</p><p></p><p>-** final, non-final, static và non-static</p><p>- có static method, main, constructor</p><p>-extends chỉ 1 abtract class</p><p></p><p>- triển khai của Interface</p>|<p>-hướng đến hành động của đối tượng</p><p></p><p>-hỗ trợ đa kế thừa</p><p>trừu tượng hóa hoàn toàn</p><p></p><p></p><p>-mặc định static,final, </p><p></p><p>- không có</p><p></p><p>- implement có thể nhiều interface</p><p>- không triển khai của Interface</p>|


|**Tính trừu tượng**|**Tính đóng gói**|
| :-: | :-: |
|<p>Sử dụng để ẩn thông tin không liên quan, dư thừa</p><p>->giảm độ phức tạp, tăng hiệu quả.</p><p></p><p></p><p>Nó giải quyết vấn đề ở mức trình bày</p><p></p><p>Tập trung vào đối tượng là gì hơn là nó làm thế nào.</p><p></p><p></p><p>Nó ẩn các chi tiết không cần thiết trên cấp độ thiết kế.</p><p></p><p>Nó được triển khai bằng lớp trừu tượng và giao diện.</p>|<p>Nó liên kết dữ liệu và thông tin lại với nhau thành một thực thể duy nhất để bảo vệ dữ liệu khỏi các nguồn bên ngoài.</p><p></p><p>Nó giải quyết vấn đề ở mức thực thi.</p><p></p><p>Nó che giấu các cơ chế bên trong về cách nó làm một cái gì đó.</p><p></p><p>Nó ẩn dữ liệu và mã để hạn chế truy cập không mong muốn.</p><p></p><p>Nó được triển khai bằng các công cụ sửa đổi truy cập được bảo vệ, riêng tư và riêng tư.</p>|

