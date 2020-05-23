$(document).ready(function () {

	 theWheel = new Winwheel({
		'canvasId': 'canvas',
		'fillStyle': '#e7706f',
		'lineWidth': 3,
		'numSegments': 5,
		'segments': [{
				'fillStyle': '#eae56f',
				'text': ''
			},
			{
				'fillStyle': '#89f26e',
				'text': ''
			},
			{
				'fillStyle': '#7de6ef',
				'text': ''
			},
			{
				'fillStyle': '#e7706f',
				'text': ''
			},
			{
				'fillStyle': '#e41311',
				'text': ''
			}
		]
	});

});

menu = new Array();
for (let i = 0; i < 5; i++) {
	menu[i] = '';
}
no = 0;
$('#bt2').click(function () {
	location.reload();
});

$('#bt1').click(function () {

	theWheel.startAnimation();
});

// $('#savebt').click(function(){




// 	});



$('#menuBox > input').click(function () {

	var al = $(this).is(":checked");

	// 		$("input[id='menu']:checked").each(function () {
	// });
	if (al) {
		menu[no] = $(this).val();
		//같은 것 들어가는거 방지
		for (let j = 0; j < no; j++) {

			if (menu[no] == menu[j]) {

				alert(no);
				return;
			}

		}
		no++;


		theWheel = new Winwheel({
			'canvasId': 'canvas',
			'fillStyle': '#e7706f',
			'lineWidth': 3,
			'numSegments': 5,
			'segments': [{
					'fillStyle': '#eae56f',
					'text': menu[0]
				},
				{
					'fillStyle': '#89f26e',
					'text': menu[1]
				},
				{
					'fillStyle': '#7de6ef',
					'text': menu[2]
				},
				{
					'fillStyle': '#e7706f',
					'text': menu[3]
				},
				{
					'fillStyle': '#e41311',
					'text': ''
				}
			],
			'animation': // Note animation properties passed in constructor parameters.
			{
				'type': 'spinToStop',
				'duration': 5,
				'spins': 8,
				'callbackFinished': 'ss()'

			}
		});
	} else {

		var menu1 = $(this).val();
		for (let i = 0; i < menu.length; i++) {
			if (menu[i] == menu1) {
				menu[i] = menu[no-1];
				menu[no-1] = '';
			}
		}
		no--;
		theWheel = new Winwheel({
			'canvasId': 'canvas',
			'fillStyle': '#e7706f',
			'lineWidth': 3,
			'numSegments': 5,
			'segments': [{
					'fillStyle': '#eae56f',
					'text': menu[0]
				},
				{
					'fillStyle': '#89f26e',
					'text': menu[1]
				},
				{
					'fillStyle': '#7de6ef',
					'text': menu[2]
				},
				{
					'fillStyle': '#e7706f',
					'text': menu[3]
				},
				{
					'fillStyle': '#e41311',
					'text': ''
				}
			],
			'animation': // Note animation properties passed in constructor parameters.
			{
				'type': 'spinToStop',
				'duration': 5,
				'spins': 8,
				'callbackFinished': 'ss()'

			}
		});
	}

});

ss = function alertPrize() {
	// Call getIndicatedSegment() function to return pointer to the segment pointed to on wheel.
	let winningSegment = theWheel.getIndicatedSegment();

	// Basic alert of the segment text which is the prize name.
	alert("오늘의 메뉴는! " + winningSegment.text + " 당점 입니다.!!!!");
}









//알랏으로 표시