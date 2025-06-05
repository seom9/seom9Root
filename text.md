const checkedBoxes = document.querySelectorAll('.attendance-check:checked'); // ← :checked 만 선택
const checkedIds = [];

checkedBoxes.forEach(box => {
checkedIds.push(box.value); // ← 체크된 input의 value 가져오기
});

return checkedIds;



function submitAllRows() {
const rows = document.querySelectorAll('.insert-input-row');
const dataList = [];

    for (const row of rows) {
      const name = row.querySelector('[name="name"]').value.trim();
      const gitHub = row.querySelector('[name="gitHub"]').value.trim();
      const careerYear = parseInt(row.querySelector('[name="careerYear"]').value.trim());
      const jobTitle = row.querySelector('[name="jobTitle"]').value.trim();

      if (!name || !gitHub || isNaN(careerYear) || !jobTitle) {
        alert("모든 입력란을 채워주세요!");
        return;
      }

      dataList.push({
        name,
        gitHub,
        careerYear,
        jobTitle
      });
    }

    fetch('/study/user/input', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(dataList)
    })
    .then(response => {
      if (response.ok) {
        alert("저장 완료!");
        location.reload(); // 또는 append 방식으로도 가능
      } else {
        return response.text().then(msg => { throw new Error(msg); });
      }
    })
    .catch(err => {
      alert("에러 발생: " + err.message);
    });
}