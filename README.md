# G-mall
Spring Boot电商学习项目，教程视屏：https://www.bilibili.com/video/av55643074

点击查看：[完整笔记](https://github.com/qiurungeng/G-mall/blob/master/SpringBoot_尚硅谷谷粒商城.md)

各服务对应的端口：

~~gmall-user用户服务：8080~~

gmall-user-service用户服务的service层端口：8070   
gmall-user-web用户服务的web层端口：8080

gmall-manage-service用户服务的service层端口：8071   
gmall-manage-web用户服务的web层端口：8081

~~gmall-item-service前台商品详情服务：8072~~   
gmall-item-web前台商品详情展示：8082

gmall-search-web 搜索服务的前台 8083   
gmall-search-service 搜索服务的后台 8073

gmall-cart-web 购物车服务的前台 8084   
gmall-cart-service 购物车服务的后台 8074

gmall-passport-web 用户认证中心 8085   
gmall-user-service 用户服务 8070

gmall-order-web 订单前台 8086   
gmall-order-service 订单服务 8076   

gmall-payment 支付服务 8087

除去以上服务外，另外引入gware-manage物流管理模块，用于与商城的支付功能对接，
该模块可接收订单支付成功的队列消息（ORDER_PAY_QUEUE），并锁定仓库中库存。服务端口号：9001