import Vue from "vue";
import App from "./App.vue";
import router from "./router";
import store from "./store";
import { BootstrapVue, BootstrapVueIcons } from 'bootstrap-vue'
import Vuex from 'vuex';
// import Chart from "chart.js";
// import chart1 from "@/js/demo/chart-area-demo.js";

import "bootstrap/dist/css/bootstrap.css";

Vue.config.productionTip = false;
// Vue.use(Chart);
Vue.use(BootstrapVue);
Vue.use(BootstrapVueIcons);
Vue.use(Vuex);
// Vue.use(chart1);

new Vue({
  router,
  store,
  render: (h) => h(App),
}).$mount("#app");
