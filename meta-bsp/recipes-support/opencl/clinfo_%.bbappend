
# Add dependency on opencl-headers and opecl-icd provided by imx-gpu-viv
DEPENDS_remove = "opencl-headers opencl-icd-loader"
DEPENDS += "virtual/opencl-headers virtual/opencl-icd"
