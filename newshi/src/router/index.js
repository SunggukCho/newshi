import Vue from "vue";
import VueRouter from "vue-router";
import Home from "../views/Home.vue";
import Article from "../views/Article.vue";

Vue.use(VueRouter);

const routes = [
  {
    path: "/",
    name: "Home",
    component: Home
  },
  {
    path: "/article",
    name: "Article",
    component: Article
  }
];

const router = new VueRouter({
  mode: "history",
  routes
});

export default router;
