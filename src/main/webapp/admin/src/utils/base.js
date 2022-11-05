const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmxiqn1/",
            name: "ssmxiqn1",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmxiqn1/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "宿舍管理系统"
        } 
    }
}
export default base
