<%--
  Created by IntelliJ IDEA.
  User: HUSHUHUA
  Date: 2019/4/7
  Time: 19:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!doctype html>
<html lang="zh-CN">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>Document</title>
  <link rel="stylesheet" href="/css/index.css">
  <link href="//netdna.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
</head>
<body>
<div id="container">
  <div id="header">
    <div class="site-brand-wrapper"></div>
    <div id="header-main" class="header-inner">
      <div class="outer">
        <a href="/" id="logo">
          <i class="logo"></i>
          <span class="site-title"> ` NEVERTHELESS `</span>
        </a>
        <nav id="main-nav">

          <a class="main-nav-link" href="/.">主页</a>

          <a class="main-nav-link" href="/archives">抓到我</a>

          <a class="main-nav-link" href="/gongzhonghao">实验室</a>

          <a class="main-nav-link" href="/techpic">归档</a>

          <a class="main-nav-link" href="/shumaquan">投喂</a>

          <a class="main-nav-link" href="/reward">留言板</a>


        </nav>

        <div id="search-form-wrap">

          <form class="search-form">
            <input type="text" class="ins-search-input search-form-input" placeholder="搜索">
            <button type="submit" class="search-form-submit"></button>
          </form>

        </div>
      </div>
    </div>
    <div id="main-nav-mobile" class="header-sub header-inner">
      <table class="menu outer">
        <tbody><tr>

          <td><a class="main-nav-link" href="/.">主页</a></td>

          <td><a class="main-nav-link" href="/archives">抓到我</a></td>

          <td><a class="main-nav-link" href="/gongzhonghao">实验室</a></td>

          <td><a class="main-nav-link" href="/techpic">归档</a></td>

          <td><a class="main-nav-link" href="/shumaquan">投喂</a></td>

          <td><a class="main-nav-link" href="/reward">留言板</a></td>
          <td>

            <div class="search-form">
              <input type="text" class="ins-search-input search-form-input" placeholder="搜索">
            </div>

          </td>
        </tr>
        </tbody></table>
    </div>
  </div>
  <div class="outer">
    <aside id="profile" class="profile-fixed">
      <div class="inner profile-inner anim-fade-in" style="animation: 0s ease 0s 1 normal none running none;">
        <div class="base-info profile-block">

          <div class="row" style="display: table">
            <div class="col-md-5" style="float: left;width: 50%">
              <img id="avatar" src="/img/logo.jpg">
            </div>
            <div class="col-md-7" style="text-align: left;padding-left: 6%; float: left; margin-top: 13%; width: 44%">
              <div style="margin-bottom: 4%">
                <small style="font-size: 13px;color:#808080ad;">普通的开发者</small>
              </div>
              <div style="margin-bottom: 4%">
                <small style="font-size: 13px;color:#808080ad;">热情的学习者</small>
              </div>
              <div>
                <small style="font-size: 13px;color:#808080ad;">狂热的数码迷</small>
              </div>

            </div>
          </div>

          <h2 id="name">程  序  羊</h2>
          <h3 id="title">Huster &amp; Developer</h3>
          <span id="location"><i class="fa fa-map-marker"></i>江苏 · 南京</span>
          <a id="follow" target="_blank" href="javascript:void(0)">点击关注我吧</a>
        </div>



        <div class="article-info profile-block">
          <div class="article-info-block">
            74
            <span>文章</span>
          </div>
          <div class="article-info-block">
            54
            <span>标签</span>
          </div>
        </div>

        <div class="profile-block social-links">
          <table>
            <tbody><tr>

              <td>
                <a href="javascript:void(0)" target="_blank" title="wx" class="tooltip">
                  <i class="fa fa-wx"></i>
                </a>
              </td>

              <td>
                <a href="https://www.jianshu.com/u/d19536b0189b" target="_blank" title="简书" class="tooltip">
                  <i class="fa fa-简书"></i>
                </a>
              </td>

              <td>
                <a href="https://github.com/hansonwang99" target="_blank" title="gayhub" class="tooltip">
                  <i class="fa fa-gayhub"></i>
                </a>
              </td>

              <td>
                <a href="https://my.oschina.net/hansonwang99" target="_blank" title="开源中国" class="tooltip">
                  <i class="fa fa-开源中国"></i>
                </a>
              </td>

              <td>
                <a href="https://juejin.im/user/59551ecdf265da6c2518cd5c/posts" target="_blank" title="掘金" class="tooltip">
                  <i class="fa fa-掘金"></i>
                </a>
              </td>

              <td>
                <a href="https://segmentfault.com/u/hansonwang99" target="_blank" title="segmentfault" class="tooltip">
                  <i class="fa fa-segmentfault"></i>
                </a>
              </td>

              <td>
                <a href="https://blog.csdn.net/wangshuaiwsws95" target="_blank" title="csdn" class="tooltip">
                  <i class="fa fa-csdn"></i>
                </a>
              </td>

              <td>
                <a href="https://weibo.com/2089758405/profile?topnav=1&amp;wvr=6&amp;is_all=1#1520088582985" target="_blank" title="新浪微博" class="tooltip">
                  <i class="fa fa-新浪微博"></i>
                </a>
              </td>

            </tr>
            </tbody></table>
        </div>

      </div>
    </aside>
  </div>
</div>

</body>
</html>
