/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

var langTW = {
    time: {
        month: [
            '一月', '二月', '三月', '四月', '五月', '六月',
            '七月', '八月', '九月', '十月', '十一月', '十二月'
        ],
        monthAbbr: [
            '1月', '2月', '3月', '4月', '5月', '6月',
            '7月', '8月', '9月', '10月', '11月', '12月'
        ],
        dayOfWeek: [
            '星期日', '星期一', '星期二', '星期三', '星期四', '星期五', '星期六'
        ],
        dayOfWeekAbbr: [
            '日', '一', '二', '三', '四', '五', '六'
        ]
    },
    legend: {
        selector: {
            all: '全選',
            inverse: '反選'
        }
    },
    toolbox: {
        brush: {
            title: {
                rect: '矩形選擇',
                polygon: '圈選',
                lineX: '橫向選擇',
                lineY: '縱向選擇',
                keep: '保持選擇',
                clear: '清除選擇'
            }
        },
        dataView: {
            title: '資料視圖',
            lang: ['資料視圖', '關閉', '刷新']
        },
        dataZoom: {
            title: {
                zoom: '區域縮放',
                back: '區域縮放還原'
            }
        },
        magicType: {
            title: {
                line: '切換為折線圖',
                bar: '切換為柱狀圖',
                stack: '切換為堆疊',
                tiled: '切換為平鋪'
            }
        },
        restore: {
            title: '還原'
        },
        saveAsImage: {
            title: '保存為圖片',
            lang: ['右鍵另存為圖片']
        }
    },
    series: {
        typeNames: {
            pie: '圓形圖',
            bar: '柱狀圖',
            line: '折線圖',
            scatter: '散點圖',
            effectScatter: '漣漪散點圖',
            radar: '雷達圖',
            tree: '樹圖',
            treemap: '矩形樹圖',
            boxplot: '箱型圖',
            candlestick: 'K線圖',
            k: 'K線圖',
            heatmap: '熱力圖',
            map: '地圖',
            parallel: '平行座標圖',
            lines: '線圖',
            graph: '關係圖',
            sankey: '桑基圖',
            funnel: '漏斗圖',
            gauge: '儀錶盤圖',
            pictorialBar: '象形柱圖',
            themeRiver: '主題河流圖',
            sunburst: '旭日圖'
        }
    },
    aria: {
        general: {
            withTitle: '這是一個關於“{title}”的圖表。',
            withoutTitle: '這是一個圖表，'
        },
        series: {
            single: {
                prefix: '',
                withName: '圖表類型是{seriesType}，表示{seriesName}。',
                withoutName: '圖表類型是{seriesType}。'
            },
            multiple: {
                prefix: '它由{seriesCount}個圖表系列組成。',
                withName: '第{seriesId}個系列是一個表示{seriesName}的{seriesType}，',
                withoutName: '第{seriesId}個系列是一個{seriesType}，',
                separator: {
                    middle: '；',
                    end: '。'
                }
            }
        },
        data: {
            allData: '其數據是——',
            partialData: '其中，前{displayCnt}項是——',
            withName: '{name}的數據是{value}',
            withoutName: '{value}',
            separator: {
                middle: '，',
                end: ''
            }
        }
    }
};
