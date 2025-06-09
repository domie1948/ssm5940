<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
  <meta charset="UTF-8">
  <meta name='viewport' content='width=device-width, initial-scale=1.0, maximum-scale=1.0' />
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>首页</title>
  <link rel="stylesheet" href="../../layui/css/layui.css">
  <link rel="stylesheet" type="text/css" href="../../xznstatic/css/iconfont.css">
  <link rel="stylesheet" type="text/css" href="../../xznstatic/css/color.css">
  <link rel="stylesheet" type="text/css" href="../../xznstatic/css/global.css">
  <link rel="stylesheet" type="text/css" href="../../xznstatic/css/page.css">
  <link rel="stylesheet" type="text/css" href="../../xznstatic/css/uzlist.css">
  <link rel="stylesheet" type="text/css" href="../../xznstatic/css/animate.min.css">
  <link rel="stylesheet" type="text/css" href="../../xznstatic/css/fancybox.css" />
  <script type="text/javascript" src="../../xznstatic/js/jquery.min.js"></script>
  <script type="text/javascript" src="../../xznstatic/js/superslide.2.1.1.min.js"></script>
  <script type="text/javascript" src="../../xznstatic/js/wow.min.js"></script>
  <script type="text/javascript" src="../../xznstatic/js/fancybox.js"></script>
  <script type="text/javascript">
    var CATID = "0",
      BCID = "0",
      NAVCHILDER = "",
      ONCONTEXT = 0,
      ONCOPY = 0,
      ONSELECT = 0;
  </script>
  <script type="text/javascript" src="../../xznstatic/js/common.js"></script>
</head>

<body>
  <div id="app">
    <div class="layui-carousel" id="swiper">
      <div carousel-item id="swiper-item">
        <div v-for="(item,index) in swiperList" v-bind:key="index">
          <img class="swiper-item" :src="item.img" width="100%" height="400px">
        </div>
      </div>
    </div>

    <div class="plate">
      <div class="plate-pic picture-a after tb80 back-white" style='background:#fff;'>
        <div class="container">
          <div class="comm-title">
            <div class="title">
              <h3>学习教材推荐</h3>
              <p>Recommend</p>
            </div>
          </div>
          <div class="picture-lists">
            <ul class="wul105">
              <li v-for="(item,index) in xuexijiaocaiRecommend" v-bind:key="index">
                <a target="_self" :href="'../xuexijiaocai/detail.jsp?id='+item.id">
                  <div class="posi-img">
                    <img :src="item.tupian?item.tupian.split(',')[0]:''" width="385" height="220" />
                  </div>
                  <div class="remark">
                    <h5>{{item.jiaocaimingcheng}}</h5>
                  </div>
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <div class="plate-pic picture-a after tb80 back-white" style='background:#fff;'>
        <div class="container">
          <div class="comm-title">
            <div class="title">
              <h3>新闻资讯推荐</h3>
              <p>Recommend</p>
            </div>
          </div>
          <div class="picture-lists">
            <ul class="wul105">
              <li v-for="(item,index) in xinwenzixunRecommend" v-bind:key="index">
                <a target="_self" :href="'../xinwenzixun/detail.jsp?id='+item.id">
                  <div class="posi-img">
                    <img :src="item.fengmian?item.fengmian.split(',')[0]:''" width="385" height="220" />
                  </div>
                  <div class="remark">
                    <h5>{{item.biaoti}}</h5>
                  </div>
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>


      <div class="plate-pic picture-a after tb80 back-white" style='background:#fff;'>
        <div class="container">
          <div class="comm-title">
            <div class="title">
              <h3>课程信息展示</h3>
              <p>DATA SHOW</p>
            </div>
          </div>
          <div class="picture-lists">
            <ul class="wul105">
              <li v-for="(item,index) in kechengxinxiList" v-bind:key="index">
                <a target="_self" :href="'../kechengxinxi/detail.jsp?id='+item.id">
                  <div class="posi-img">
                    <img :src="item.fengmian?item.fengmian.split(',')[0]:''" width="385" height="220" />
                  </div>
                  <div class="remark">
                    <h5>{{item.kechengmingcheng}}</h5>
                    <p v-if="item.price">{{item.price}} RMB</p>
                  </div>
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <div class="plate-pic picture-a after tb80 back-white" style='background:#fff;'>
        <div class="container">
          <div class="comm-title">
            <div class="title">
              <h3>学习教材展示</h3>
              <p>DATA SHOW</p>
            </div>
          </div>
          <div class="picture-lists">
            <ul class="wul105">
              <li v-for="(item,index) in xuexijiaocaiList" v-bind:key="index">
                <a target="_self" :href="'../xuexijiaocai/detail.jsp?id='+item.id">
                  <div class="posi-img">
                    <img :src="item.tupian?item.tupian.split(',')[0]:''" width="385" height="220" />
                  </div>
                  <div class="remark">
                    <h5>{{item.jiaocaimingcheng}}</h5>
                    <p v-if="item.price">{{item.price}} RMB</p>
                  </div>
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <div class="plate-pic picture-a after tb80 back-white" style='background:#fff;'>
        <div class="container">
          <div class="comm-title">
            <div class="title">
              <h3>教学资源展示</h3>
              <p>DATA SHOW</p>
            </div>
          </div>
          <div class="picture-lists">
            <ul class="wul105">
              <li v-for="(item,index) in jiaoxueziyuanList" v-bind:key="index">
                <a target="_self" :href="'../jiaoxueziyuan/detail.jsp?id='+item.id">
                  <div class="posi-img">
                    <img :src="item.tupian?item.tupian.split(',')[0]:''" width="385" height="220" />
                  </div>
                  <div class="remark">
                    <h5>{{item.mingcheng}}</h5>
                    <p v-if="item.price">{{item.price}} RMB</p>
                  </div>
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>
      <div class="plate-pic picture-a after tb80 back-white" style='background:#fff;'>
        <div class="container">
          <div class="comm-title">
            <div class="title">
              <h3>新闻资讯展示</h3>
              <p>DATA SHOW</p>
            </div>
          </div>
          <div class="picture-lists">
            <ul class="wul105">
              <li v-for="(item,index) in xinwenzixunList" v-bind:key="index">
                <a target="_self" :href="'../xinwenzixun/detail.jsp?id='+item.id">
                  <div class="posi-img">
                    <img :src="item.fengmian?item.fengmian.split(',')[0]:''" width="385" height="220" />
                  </div>
                  <div class="remark">
                    <h5>{{item.biaoti}}</h5>
                    <p v-if="item.price">{{item.price}} RMB</p>
                  </div>
                </a>
              </li>
            </ul>
          </div>
        </div>
      </div>
    </div>

    <div class="footer footer-a back-black" style='background:#F67280;'>
      <div class="container">
        <div class="footer-text center">
          <div class="links">
            <span v-text="projectName"></span>
          </div>
        </div>
      </div>
    </div>
  </div>

  <script src="../../layui/layui.js"></script>
  <script src="../../js/vue.js"></script>
  <script src="../../js/config.js"></script>
  <script src="../../modules/config.js"></script>
  <script src="../../js/utils.js"></script>

  <script>
    var vue = new Vue({
      el: '#app',
      data: {
        projectName: projectName,
        swiperList: [{
          img: '../../img/banner.jpg'
        }],
      xuexijiaocaiRecommend: [],
      xinwenzixunRecommend: [],

      kechengxinxiList: [],
      xuexijiaocaiList: [],
      jiaoxueziyuanList: [],
      xinwenzixunList: [],
        newsList: []
      },
      filters: {
        newsDesc: function(val) {
          if (val) {
            val = val.replace(/<[^<>]+>/g, '').replace(/undefined/g, '');
            if (val.length > 60) {
              val = val.substring(0, 60);
            }

            return val;
          }
          return '';
        }
      },
      methods: {
        jump(url) {
          jump(url)
        }
      }
    });

    layui.use(['layer', 'form', 'element', 'carousel', 'http', 'jquery'], function() {
      var layer = layui.layer;
      var element = layui.element;
      var form = layui.form;
      var carousel = layui.carousel;
      var http = layui.http;
      var jquery = layui.jquery;

      http.request('config/list', 'get', {
        page: 1,
        limit: 5
      }, function(res) {
        if (res.data.list.length > 0) {
          var swiperItemHtml = '';
          for (let item of res.data.list) {
            if (item.name.indexOf('picture') >= 0 && item.value && item.value != "" && item.value != null) {
              swiperItemHtml +=
                '<div>' +
                '<img class="swiper-item" src="' + item.value + '" width="100%" height="400px">' +
                '</div>';
            }
          }
          jquery('#swiper-item').html(swiperItemHtml);
          // 轮播图
          carousel.render({
            elem: '#swiper',
            width: '100%',
            height: '400px',
            arrow: 'always',
            anim: 'fade',
            interval: 1800,
            indicator: 'inside'
          });
        }
      });
              

      http.request(`xuexijiaocai/autoSort`, 'get', {
        page: 1,
        limit: 6
      }, function(res) {
        vue.xuexijiaocaiRecommend = res.data.list;
      });
      http.request(`xinwenzixun/autoSort`, 'get', {
        page: 1,
        limit: 6
      }, function(res) {
        vue.xinwenzixunRecommend = res.data.list;
      });

      http.request(`kechengxinxi/list`, 'get', {
        page: 1,
        limit: 6
      }, function(res) {
        vue.kechengxinxiList = res.data.list;
      });
      http.request(`xuexijiaocai/list`, 'get', {
        page: 1,
        limit: 6
      }, function(res) {
        vue.xuexijiaocaiList = res.data.list;
      });
      http.request(`jiaoxueziyuan/list`, 'get', {
        page: 1,
        limit: 6
      }, function(res) {
        vue.jiaoxueziyuanList = res.data.list;
      });
      http.request(`xinwenzixun/list`, 'get', {
        page: 1,
        limit: 6
      }, function(res) {
        vue.xinwenzixunList = res.data.list;
      });
    });
  </script>
</body>

</html>