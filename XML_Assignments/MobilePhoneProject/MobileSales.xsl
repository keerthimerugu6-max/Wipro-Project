<?xml version="1.0" encoding="UTF-8"?>

<xsl:stylesheet version="1.0"
    xmlns:xsl="http://www.w3.org/1999/XSL/Transform">

    <xsl:output method="html" encoding="UTF-8"/>

    <xsl:template match="/">

        <html>

            <head>

                <title>Mobile Phone Sales Summary</title>

                <style>

                    body {
                        font-family: Arial, sans-serif;
                        background-color: white;
                    }

                    h2 {
                        text-align: center;
                        color: black;
                    }

                    table {
                        border-collapse: collapse;
                        margin: 20px auto;
                        width: 95%;
                    }

                    th {
                        background-color: #00a9d6;
                        color: white;
                        padding: 8px;
                        border: 1px solid black;
                    }

                    td {
                        padding: 7px;
                        border: 1px solid black;
                        text-align: center;
                    }

                    .highSales {
                        color: red;
                        font-weight: bold;
                    }

                </style>

            </head>

            <body>

                <h2>Mobile Phone Sales Summary</h2>

                <table>

                    <tr>
                        <th>Model Name</th>
                        <th>Model ID</th>
                        <th>Brand</th>
                        <th>Price</th>
                        <th>Color</th>
                        <th>Size</th>
                        <th>Memory</th>
                        <th>Camera</th>
                        <th>Touch Screen</th>
                        <th>Number Sold</th>
                        <th>Store Name</th>
                    </tr>

                    <xsl:for-each select="mobileSales/mobile">

                        <tr>

                            <td>
                                <xsl:value-of select="modelName"/>
                            </td>

                            <td>
                                <xsl:value-of select="modelID"/>
                            </td>

                            <td>
                                <xsl:value-of select="brand"/>
                            </td>

                            <td>
                                <xsl:value-of select="price"/>
                            </td>

                            <td>
                                <xsl:value-of select="color"/>
                            </td>

                            <td>
                                <xsl:value-of select="size"/>
                            </td>

                            <td>
                                <xsl:value-of select="memory"/>
                            </td>

                            <td>
                                <xsl:value-of select="camera"/>
                            </td>

                            <td>
                                <xsl:value-of select="touchScreen"/>
                            </td>

                            <td>

                                <xsl:choose>

                                    <xsl:when test="noSold &gt; 10">

                                        <span class="highSales">
                                            <xsl:value-of select="noSold"/>
                                        </span>

                                    </xsl:when>

                                    <xsl:otherwise>

                                        <xsl:value-of select="noSold"/>

                                    </xsl:otherwise>

                                </xsl:choose>

                            </td>

                            <td>
                                <xsl:value-of select="storeName"/>
                            </td>

                        </tr>

                    </xsl:for-each>

                </table>

            </body>

        </html>

    </xsl:template>

</xsl:stylesheet>