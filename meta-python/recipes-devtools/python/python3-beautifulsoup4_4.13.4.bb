SUMMARY = "Screen-scraping library"
HOMEPAGE = " https://www.crummy.com/software/BeautifulSoup/bs4"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=96e0034f7c9443910c486773aa1ed9ac"

SRC_URI[sha256sum] = "dbb3c4e1ceae6aefebdaf2423247260cd062430a410e38c66f2baa50a8437195"

inherit pypi python_hatchling

RDEPENDS:${PN} = "\
    python3-html5lib \
    python3-lxml \
    python3-html \
    python3-logging \
"
RDEPENDS:${PN}:append:class-target = " \
    python3-soupsieve \
"

BBCLASSEXTEND = "native nativesdk"
