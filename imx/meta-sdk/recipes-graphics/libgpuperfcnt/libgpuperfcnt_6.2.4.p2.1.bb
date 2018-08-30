DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[arm-fb.md5sum] = "a0e45100eda4d7d162e4cae3845eb0bf"
SRC_URI[arm-fb.sha256sum] = "5add5a8438c65c95df7db064cd49d5c60a2e968a6134be1a4d2118ff16a218f3"

SRC_URI[arm-wayland.md5sum] = "626837d5cb3d50122de90c18c3b41d08"
SRC_URI[arm-wayland.sha256sum] = "fe3db0eabfc89203d800d63865a578d8daec50d55994b13bef190b301e8ccf29"

SRC_URI[arm-x11.md5sum] = "ab986c335badd7b7b7ac036bc3039bdf"
SRC_URI[arm-x11.sha256sum] = "0788349a4b02b8064c337a62e808436b4d87872951783494fdd383a5a85658db"

SRC_URI[aarch64-fb.md5sum] = "79b327e4e33415b9fa2679054b067919"
SRC_URI[aarch64-fb.sha256sum] = "78e4a3d483502992916043ea9784b0121ae00b783a760ec6cb52ddbff64e34ed"

SRC_URI[aarch64-wayland.md5sum] = "ef422b3278dda05e8085d9b453fdd6c4"
SRC_URI[aarch64-wayland.sha256sum] = "24af87d860a4e291ef65745ecd34498e84e05d5248f0efaa8a5546467a3abbaa"

SRC_URI[aarch64-x11.md5sum] = "561c06b6f9b99c03f501403e9a0ebc6f"
SRC_URI[aarch64-x11.sha256sum] = "846d9fe74ae1a195eb3e0e6bc5b0000ac00a4a4bbe3c9340b2028883841b3837"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"
