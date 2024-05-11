<template>
	<view class="content">
		<form class="app-update-pv">
			
									<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(1, 157, 214, 0.1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 0 4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">作品名称</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"0 20rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"80rpx"}' :disabled="ro.zuopinmingcheng" v-model="ruleForm.zuopinmingcheng" placeholder="作品名称"></input>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(1, 157, 214, 0.1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 0 4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group select">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">作品分类</view>
				<picker @change="zuopinfenleiChange" :value="zuopinfenleiIndex" :range="zuopinfenleiOptions">
					<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"0 20rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"80rpx"}' class="uni-input">{{ruleForm.zuopinfenlei?ruleForm.zuopinfenlei:"请选择作品分类"}}</view>
				</picker>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(1, 157, 214, 0.1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"200rpx"}' class="cu-form-group" @tap="zuopinfengmianTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">作品封面</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<image :style='{"width":"160rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"160rpx"}' class="avator" v-if="ruleForm.zuopinfengmian" :src="ruleForm.zuopinfengmian" mode="aspectFill"></image>
					<image :style='{"width":"160rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"160rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(1, 157, 214, 0.1)","borderColor":"#ccc","margin":"0 0 20rpx 0","borderWidth":"0","borderStyle":"solid","height":"200rpx"}' class="cu-form-group" @tap="zuopinneirongTap" :class='left == "left"?"":"active"'>
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">作品内容</view>
				<view class="right-input" :style='{textAlign:"left"}' style="padding:0">
					<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"0 20rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"80rpx"}' v-if="ruleForm.zuopinneirong"  v-model="ruleForm.zuopinneirong" placeholder="作品内容"></input>
					<image :style='{"width":"160rpx","boxShadow":"0 0 8rpx rgba(0,0,0,.3)","borderRadius":"100%","textAlign":"left","height":"160rpx"}' class="avator" v-else src="../../static/gen/upload.png" mode="aspectFill"></image>
				</view>
			</view>
												<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(1, 157, 214, 0.1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0","borderWidth":"0 0 4rpx","borderStyle":"solid","height":"108rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">发布日期</view>
				<input :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0)","borderColor":"rgba(0,0,0,.6)","borderRadius":"0 20rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"80rpx"}' v-model="ruleForm.faburiqi" placeholder="发布日期" @tap="toggleTab('faburiqi')"></input>
			</view>
																																				
			<!-- 否 -->
 
			
			          				          				          				          				          				          				<view :style='{"boxShadow":"0 0 0px rgba(0,0,0,.3)","backgroundColor":"rgba(1, 157, 214, 0.1)","borderColor":"rgba(245, 245, 245, 1)","margin":"0 0 0 0","borderWidth":"4rpx","borderStyle":"solid","height":"308rpx"}' class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"rgba(51, 51, 51, 1)","textAlign":"center"}' class="title">作品简介</view>
				<textarea :style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 0.1)","borderColor":"rgba(0,0,0,.6)","borderRadius":"0 20rpx","color":"rgba(51, 51, 51, 1)","textAlign":"left","borderWidth":"2rpx","fontSize":"26rpx","borderStyle":"solid","height":"280rpx"}' v-model="ruleForm.zuopinjianjie" placeholder="作品简介"></textarea>
			</view>
						          				          							
			          				          				          				          				          				          				          				          							
			<view class="btn">
				<button :style='{"boxShadow":"0 0 0px rgba(0,0,0,0) inset","backgroundColor":"rgba(1, 157, 214, 1)","borderColor":"#409EFF","borderRadius":"0 0 20rpx 20rpx","color":"#fff","borderWidth":"0","width":"90%","fontSize":"28rpx","borderStyle":"solid","height":"80rpx"}' @tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

																						<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="faburiqiConfirm" ref="faburiqi" themeColor="#333333"></w-picker>
																			
	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				ruleForm: {
												zuopinmingcheng: '',
																zuopinfenlei: '',
																zuopinfengmian: '',
																zuopinneirong: '',
																faburiqi: '',
																zuopinjianjie: '',
																thumbsupnum: '',
																crazilynum: '',
												},
																				zuopinfenleiOptions: [],
				zuopinfenleiIndex: 0,
																																																												// 登陆用户信息
				user: {},
                                ro:{
                                   zuopinmingcheng : false,
                                   zuopinfenlei : false,
                                   zuopinfengmian : false,
                                   zuopinneirong : false,
                                   faburiqi : false,
                                   zuopinjianjie : false,
                                   thumbsupnum : false,
                                   crazilynum : false,
                                },
			}
		},
		components: {
			wPicker
		},
		computed: {
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
					},
		async onLoad(options) {
			let table = uni.getStorageSync("nowTable");
			// 获取用户信息
			let res = await this.$api.session(table);
			this.user = res.data;
			
						// ss读取
																																																						
																		// 下拉框
			res = await this.$api.option(`biaoqian`,`biaoqian`,{});
			this.zuopinfenleiOptions = res.data;
																																													
			// 如果有登陆，获取登陆后保存的userid
			this.ruleForm.userid = uni.getStorageSync("userid")
			if (options.refid) {
				// 如果上一级页面传递了refid，获取改refid数据信息
				this.ruleForm.refid = options.refid;
				this.ruleForm.nickname = uni.getStorageSync("nickname");
			}
			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				res = await this.$api.info(`zuopin`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			// 跨表
			if(options.cross){
				var obj = uni.getStorageSync('crossObj');
				for (var o in obj){
					if(o=='zuopinmingcheng'){
					this.ruleForm.zuopinmingcheng = obj[o];
					this.ro.zuopinmingcheng = true;
					continue;
					}
					if(o=='zuopinfenlei'){
					this.ruleForm.zuopinfenlei = obj[o];
					this.ro.zuopinfenlei = true;
					continue;
					}
					if(o=='zuopinfengmian'){
					this.ruleForm.zuopinfengmian = obj[o];
					this.ro.zuopinfengmian = true;
					continue;
					}
					if(o=='zuopinneirong'){
					this.ruleForm.zuopinneirong = obj[o];
					this.ro.zuopinneirong = true;
					continue;
					}
					if(o=='faburiqi'){
					this.ruleForm.faburiqi = obj[o];
					this.ro.faburiqi = true;
					continue;
					}
					if(o=='zuopinjianjie'){
					this.ruleForm.zuopinjianjie = obj[o];
					this.ro.zuopinjianjie = true;
					continue;
					}
					if(o=='thumbsupnum'){
					this.ruleForm.thumbsupnum = obj[o];
					this.ro.thumbsupnum = true;
					continue;
					}
					if(o=='crazilynum'){
					this.ruleForm.crazilynum = obj[o];
					this.ro.crazilynum = true;
					continue;
					}
				}
			}
			this.styleChange()
		},
		methods: {
			styleChange() {
				this.$nextTick(()=>{
					// document.querySelectorAll('.app-update-pv .cu-form-group .uni-input-input').forEach(el=>{
					//   el.style.backgroundColor = this.addUpdateForm.input.content.backgroundColor
					// })
				})
			},
																																																						
			// 多级联动参数
																																																						
																																																			
																																	// 日长控件选择日期时间
			faburiqiConfirm(val) {
				console.log(val)
				this.ruleForm.faburiqi = val.result;
				this.$forceUpdate();
			},
																								
															// 下拉变化
			zuopinfenleiChange(e) {
				this.zuopinfenleiIndex = e.target.value
				this.ruleForm.zuopinfenlei = this.zuopinfenleiOptions[this.zuopinfenleiIndex]
			},
																																										
																											zuopinfengmianTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zuopinfengmian = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
															zuopinneirongTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.zuopinneirong = _this.$base.url + 'upload/' + res.file;
					_this.$forceUpdate();
					_this.$nextTick(()=>{
						_this.styleChange()
					})
				});
			},
																																													
			getUUID () {
				return new Date().getTime();
			},
			async onSubmitTap() {
																																																																																																																																																																																																																																																																																																																												if((!this.ruleForm.zuopinmingcheng)){
					this.$utils.msg(`作品名称不能为空`);
					return
				}
																																												if((!this.ruleForm.zuopinfenlei)){
					this.$utils.msg(`作品分类不能为空`);
					return
				}
																																																																																																																																																																																																if(this.ruleForm.thumbsupnum&&(!this.$validate.isIntNumer(this.ruleForm.thumbsupnum))){
					this.$utils.msg(`赞应输入整数`);
					return
				}
																																												if(this.ruleForm.crazilynum&&(!this.$validate.isIntNumer(this.ruleForm.crazilynum))){
					this.$utils.msg(`踩应输入整数`);
					return
				}
																																				if(this.ruleForm.id){
					await this.$api.update(`zuopin`, this.ruleForm);
				}else{
					await this.$api.add(`zuopin`, this.ruleForm);
				}
				this.$utils.msgBack('提交成功');
			},
			optionsChange(e) {
				this.index = e.target.value
			},
			bindDateChange(e) {
				this.date = e.target.value
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}
	
	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
				background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}
	
	.cu-form-group.active {
		justify-content: space-between;
	}
	
	.btn {
	  display: flex;
	  align-items: center;
	  justify-content: center;
	  flex-wrap: wrap;
	  padding: 20upx 0;
	}
	
	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}
	
	.cu-form-group+.cu-form-group {
		border: 0;
	}
	
	.cu-form-group uni-input {
		padding: 0 30upx;
	}
	
	.uni-input {
		padding: 0 30upx;
	}
	
	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}
	
	.cu-form-group uni-picker::after {
		line-height: 80rpx;
	}
	
	.select .uni-input {
		line-height: 80rpx;
	}
	
	.input .right-input {
		line-height: 80rpx;
	}
</style>
