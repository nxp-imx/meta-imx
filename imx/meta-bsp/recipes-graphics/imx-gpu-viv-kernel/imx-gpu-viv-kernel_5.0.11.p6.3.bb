# Copyright (C) 2015 Freescale Semiconductor

require imx-gpu-viv-kernel.inc
          
SRC_URI[md5sum] = "4e35d8300529af0c9ad4ea75aba31be7"
SRC_URI[sha256sum] = "e52dd86d0dc90d816467f68a7158ca336d47d111ff6fdbcf4cc8280b43e8c326"

S="${WORKDIR}/${PN}-${@'${PV}'.replace('5.0.11.p6.3', '5.0.11.p6.3-beta')}"
