const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmkn0jp/",
            name: "ssmkn0jp",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmkn0jp/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "作品集展示小程序"
        } 
    }
}
export default base
